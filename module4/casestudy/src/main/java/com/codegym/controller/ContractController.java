package com.codegym.controller;

import com.codegym.dto.ContractDto;
import com.codegym.model.entity.contract.Contract;
import com.codegym.model.entity.contract_detail.ContractDetail;
import com.codegym.model.entity.customer.Customer;
import com.codegym.model.entity.employee.Employee;
import com.codegym.model.entity.service.Service;
import com.codegym.model.service.contract_detail_service.ContractDetailService;
import com.codegym.model.service.contract_service.ContractService;
import com.codegym.model.service.customer_service.CustomerService;
import com.codegym.model.service.employee_service.EmployeeService;
import com.codegym.model.service.service_service.ServiceService;
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
public class ContractController {
    @Autowired
    private ContractService contractServiceImpl;
    @Autowired
    private EmployeeService employeeServiceImpl;
    @Autowired
    private CustomerService customerServiceImpl;
    @Autowired
    private ServiceService serviceServiceImpl;
    @Autowired
    private ContractDetailService contractDetailServiceImpl;

    @ModelAttribute("employees")
    public Iterable<Employee> employees(){
        return employeeServiceImpl.findAll();
    }
    @ModelAttribute("customers")
    public Iterable<Customer> customers(){
        return customerServiceImpl.findAll();
    }
    @ModelAttribute("services")
    public Iterable<Service> services(){
        return serviceServiceImpl.findAll();
    }

    @GetMapping(value = "/contracts")
    public String showContract(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2)Pageable pageable){
        Page<Contract> contracts;
        String searchValue="" ;

        if(search.isPresent()){
            searchValue=search.get();
        }
        contracts=contractServiceImpl.findByNameContaining(searchValue,pageable);
        model.addAttribute("contracts",contracts);
        model.addAttribute("searchValue",searchValue);

//
//        model.addAttribute("search",(search.orElse("")));
//        model.addAttribute("contracts",contractServiceImpl.findAllByIdContaining(search.orElse(""),pageable));
        return "contract/list";
    }
    @GetMapping(value = "/create-contract")
    public String showCreateContract(Model model){
        ContractDto contractDto=new ContractDto();
        model.addAttribute("contractDto",contractDto);
        return "contract/create";
    }
    @PostMapping(value = "/save-contract")
    public String saveContract(@Valid @ModelAttribute ContractDto contractDto, BindingResult bindingResult, Model model){
        new ContractDto().validate(contractDto,bindingResult);

        if(bindingResult.hasErrors()){
            return "contract/create";
        }else {

            Contract contract=new Contract();
            BeanUtils.copyProperties(contractDto,contract);
            Iterable<ContractDetail> contractDetails= contractDetailServiceImpl.findAll();
            for(ContractDetail contractDetail:contractDetails){
                if(contractDetail.getContract().getId()==contract.getId()){
                    contract.setContractTotalMoney(contract.getService().getServiceCost()+(contractDetail.getAttachService().getAttachServiceCost()*contractDetail.getQuantity()));
                }else {
                    contract.setContractTotalMoney(contract.getService().getServiceCost());
                }

            }
            contractServiceImpl.save(contract);
            ContractDto contractDto1=new ContractDto();
            model.addAttribute("message","create Contract success");
            model.addAttribute("contractDto",contractDto1);
            return "contract/create";
        }
    }
    @GetMapping(value = "/edit-contract/{id}")
    public String showEditContract(@PathVariable Integer id,Model model){
        Optional<Contract> contract=contractServiceImpl.findById(id);
        ContractDto contractDto=new ContractDto();
        BeanUtils.copyProperties(contract.get(),contractDto);
        model.addAttribute("contractDto",contractDto);
        return "contract/edit";
    }
    @PostMapping(value = "/update-contract")
    public String updateContract(@Valid @ModelAttribute ContractDto contractDto,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "contract/edit";
        }else {
            Contract contract=new Contract();
            BeanUtils.copyProperties(contractDto,contract);
            contractServiceImpl.save(contract);
            ContractDto contractDto1 =new ContractDto();
            model.addAttribute("contractDto",contractDto1);
            return "contract/edit";
        }
    }
    @PostMapping(value = "/delete-contract")
    public String deleteContract(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        Optional<Contract> contract=contractServiceImpl.findById(id);
        contract.get().setFlag(false);
        contractServiceImpl.save(contract.get());
        redirectAttributes.addFlashAttribute("message","delete Contract success");
        return "redirect:/contracts";
    }

}
