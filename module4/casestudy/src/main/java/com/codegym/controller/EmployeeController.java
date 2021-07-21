package com.codegym.controller;

import com.codegym.dto.EmployeeDto;
import com.codegym.model.entity.division.Division;
import com.codegym.model.entity.education.Education;
import com.codegym.model.entity.employee.Employee;
import com.codegym.model.entity.position.Position;
import com.codegym.model.service.division_service.DivisionService;
import com.codegym.model.service.education_service.EducationService;
import com.codegym.model.service.employee_service.EmployeeService;
import com.codegym.model.service.position_service.PositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
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
//    @Autowired
//    private UserService userServiceImpl;

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
//    public Iterable<User> users() {
//        return userServiceImpl.findAll();
//    }



//    @GetMapping(value = "/employees")
//    public String showEmployee(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2) Pageable pageable){
//        Page<Employee> employees;
//        String searchValue="";
//        if(search.isPresent()){
//            searchValue=search.get();
//            employees=employeeServiceImpl.findAllByEmployeeNameContaining(searchValue,pageable);
//        }else {
//            employees=employeeServiceImpl.findAll(pageable);
//        }
//        model.addAttribute("employees",employees);
//        model.addAttribute("searchValue",searchValue);
//        return "employee/list";
//    }


    @GetMapping(value = "/employees")
    public String show(){
        return "employee/index";
    }

    @GetMapping(value="/create-employee")
    public String showCreateEmployee(Model model){
        EmployeeDto employeeDto= new EmployeeDto();
        model.addAttribute("employeeDto",employeeDto);
        return "employee/create";
    }
    @PostMapping(value ="/save-employee")
    public String createEmployee(@Valid @ModelAttribute EmployeeDto employeeDto,BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "employee/create";
        }else {
            Employee employee=new Employee();
            BeanUtils.copyProperties(employeeDto,employee);
            employeeServiceImpl.save(employee);
            EmployeeDto employeeDto1 = new EmployeeDto();
            model.addAttribute("message", "create Employee success");
            model.addAttribute("employeeDto", employeeDto1);
            return "employee/create";
        }
    }
    @GetMapping(value ="/edit-employee/{id}")
    public String showEditEmployee(@PathVariable Integer id,Model model){
        Optional<Employee> employee=employeeServiceImpl.findById(id);
        EmployeeDto employeeDto=new EmployeeDto();
        BeanUtils.copyProperties(employee.get(),employeeDto);
        model.addAttribute("employeeDto",employeeDto);
        return "employee/edit";
    }
    @PostMapping(value = "/update-employee")
    public String updateEmployee(@Valid @ModelAttribute EmployeeDto employeeDto,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "employee/edit";
        }else {
            Employee employee= new Employee();
            BeanUtils.copyProperties(employeeDto,employee);
            employeeServiceImpl.save(employee);
            model.addAttribute("message", "Edit Employee Success");
            model.addAttribute("employee", employee);
            return "employee/edit";
        }
    }
    @PostMapping(value = "/delete-employee")
    public String deleteEmployee(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        Optional<Employee> employee= employeeServiceImpl.findById(id);
        employee.get().setFlag(false);
        employeeServiceImpl.save(employee.get());
        redirectAttributes.addFlashAttribute("message","delete Employee success");
        return "redirect:/chanh";
    }


}
