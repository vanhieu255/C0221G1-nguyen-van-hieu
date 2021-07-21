package com.codegym.controller;

import com.codegym.dto.ServiceDto;
import com.codegym.model.entity.rent_type.RentType;
import com.codegym.model.entity.service.Service;
import com.codegym.model.entity.service_type.ServiceType;
import com.codegym.model.repository.service_repository.ServiceRepository;
import com.codegym.model.service.rent_type_service.RentTypeService;
import com.codegym.model.service.service_service.ServiceService;
import com.codegym.model.service.service_type_service.ServiceTypeService;
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
public class ServiceController {
    @Autowired
    private ServiceService serviceServiceImpl;
    @Autowired
    private ServiceTypeService serviceTypeServiceImpl;
    @Autowired
    private RentTypeService rentTypeServiceImpl;

    @ModelAttribute("serviceTypes")
    public Iterable<ServiceType> serviceTypes(){
        return serviceTypeServiceImpl.findAll();
    }
    @ModelAttribute("rentTypes")
    public Iterable<RentType> rentTypes(){
        return rentTypeServiceImpl.findAll();
    }

    @GetMapping(value = "/services")
    public String showListService(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2)Pageable pageable){
        Page<Service> services;
        String searchValue ="";
        if(search.isPresent()){
            searchValue=search.get();
            services=serviceServiceImpl.findAllByServiceNameContaining(searchValue,pageable);
        }else {
            services=serviceServiceImpl.findAll(pageable);
        }
        model.addAttribute("searchValue",searchValue);
        model.addAttribute("services",services);
        return "service/list";

    }
    @GetMapping(value = "/create-service")
    public String showCreateService(Model model){
        ServiceDto serviceDto=new ServiceDto();
        model.addAttribute("serviceDto",serviceDto);
        return "service/create";
    }
    @PostMapping(value = "/save-service")
    public String saveService(@Valid @ModelAttribute ServiceDto serviceDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "service/create";
        }else{
            Service service=new Service();
            BeanUtils.copyProperties(serviceDto,service);
            serviceServiceImpl.save(service);
            ServiceDto serviceDto1=new ServiceDto();
            model.addAttribute("message","create Service success");
            model.addAttribute("serviceDto",serviceDto1);
            return "service/create";
        }
    }
    @GetMapping(value = "/edit-service/{id}")
    public String showEditService(@PathVariable Integer id,Model model){
        Optional<Service> service=serviceServiceImpl.findById(id);
        ServiceDto serviceDto=new ServiceDto();
        BeanUtils.copyProperties(service.get(),serviceDto);
        model.addAttribute("serviceDto",serviceDto);
        return "service/edit";
    }
    @PostMapping(value = "/update-service")
    public String updateService(@Valid @ModelAttribute ServiceDto serviceDto,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "service/edit";
        }else {
            Service service=new Service();
            BeanUtils.copyProperties(serviceDto,service);
            serviceServiceImpl.save(service);
            ServiceDto serviceDto1=new ServiceDto();
            model.addAttribute("message","edit service success");
            model.addAttribute("serviceDto",serviceDto1);
            return "service/edit";
        }
    }
    @PostMapping(value ="/delete-service")
    public String deleteService(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        Optional<Service> service =serviceServiceImpl.findById(id);
        service.get().setFlag(false);
        serviceServiceImpl.save(service.get());
        redirectAttributes.addFlashAttribute("message","delete service success");
        return "redirect:/services";
    }

}
