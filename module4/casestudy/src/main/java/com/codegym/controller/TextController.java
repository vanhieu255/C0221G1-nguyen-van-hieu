package com.codegym.controller;

import com.codegym.model.entity.employee.Employee;
import com.codegym.model.service.employee_service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class TextController {

    @Autowired
    private EmployeeService employeeServiceImpl;

    @GetMapping(value = "/abc")
    public String showEmployee(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2) Pageable pageable) {
        Page<Employee> employees;
        String searchValue = "";

        if (search.isPresent()) {
            searchValue = search.get();
            employees = employeeServiceImpl.findAllByEmployeeNameContaining(searchValue, pageable);
        } else {
            employees = employeeServiceImpl.findAll(pageable);
        }
        model.addAttribute("employees", employees);
        model.addAttribute("searchValue", searchValue);
        return "employee/list";
    }
}
