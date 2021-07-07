package com.codegym.controller;

import com.codegym.model.entity.division.Division;
import com.codegym.model.entity.education.Education;
import com.codegym.model.entity.employee.Employee;
import com.codegym.model.entity.position.Position;
import com.codegym.model.entity.use.User;
import com.codegym.model.service.division_service.DivisionService;
import com.codegym.model.service.education_service.EducationService;
import com.codegym.model.service.employee_service.EmployeeService;
import com.codegym.model.service.position_service.PositionService;
import com.codegym.model.service.user_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeServiceImpl;
    @Autowired
    private EducationService educationServiceImpl;
    @Autowired
    private PositionService positionServiceImpl;
    @Autowired
    private DivisionService divisionServiceImpl;
    @Autowired
    private UserService userServiceImpl;

    @ModelAttribute("educations")
    public Iterable<Education> educations() {
        return educationServiceImpl.findAll();
    }
    @ModelAttribute("positions")
    public Iterable<Position> positions() {
        return positionServiceImpl.findAll();
    }
    @ModelAttribute("divisions")
    public Iterable<Division> divisions() {
        return divisionServiceImpl.findAll();
    }
    @ModelAttribute("users")
    public Iterable<User> users() {
        return userServiceImpl.findAll();
    }



    @GetMapping(value = "/employees")
    public String showEmployee(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2) Pageable pageable){
        Page<Employee> employees;
        String searchValue="";
        if(search.isPresent()){
            searchValue=search.get();
            employees=employeeServiceImpl.findAllByEmployeeNameContaining(searchValue,pageable);
        }else {
            employees=employeeServiceImpl.findAll(pageable);
        }
        model.addAttribute("employees",employees);
        model.addAttribute("searchValue",searchValue);
        return "employee/list";
    }

    @GetMapping(value="/create-employee")
    public String showCreateEmployee(Model model){
        Employee employee= new Employee();
        model.addAttribute("employee",employee);
        return "employee/create";
    }
    @PostMapping(value ="/save-employee")
    public String createEmployee(@ModelAttribute Employee employee,Model model){
        employeeServiceImpl.save(employee);
        Employee employee1=new Employee();
        model.addAttribute("message","create Employee success");
        model.addAttribute("employee",employee1);
        return "employee/create";
    }
    @GetMapping(value ="/edit-employee/{id}")
    public String showEditEmployee(@PathVariable Integer id,Model model){
        Optional<Employee> employee=employeeServiceImpl.findById(id);
        model.addAttribute("employee",employee);
        return "employee/edit";
    }
    @PostMapping(value = "/update-employee")
    public String updateEmployee(@ModelAttribute Employee employee,Model model){
        employeeServiceImpl.save(employee);
        model.addAttribute("message","Edit Employee Success");
        model.addAttribute("employee",employee);
        return "employee/edit";
    }
    @PostMapping(value = "/delete-employee")
    public String deleteEmployee(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        Optional<Employee> employee= employeeServiceImpl.findById(id);
        employee.get().setFlag(false);
        employeeServiceImpl.save(employee.get());
        redirectAttributes.addFlashAttribute("message","delete Employee success");
        return "redirect:/employees";
    }


}
