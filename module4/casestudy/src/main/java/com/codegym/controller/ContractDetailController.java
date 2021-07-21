package com.codegym.controller;

import com.codegym.model.entity.attach_service.AttachService;
import com.codegym.model.entity.contract.Contract;
import com.codegym.model.entity.contract_detail.ContractDetail;
import com.codegym.model.entity.customer_type.CustomerType;
import com.codegym.model.service.attach_service_service.AttachServiceService;
import com.codegym.model.service.contract_detail_service.ContractDetailService;
import com.codegym.model.service.contract_service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContractDetailController {
    @Autowired
    private ContractDetailService contractDetailServiceImpl;
    @Autowired
    private AttachServiceService attachServiceServiceImpl;
    @Autowired
    private ContractService contractServiceImpl;

    @ModelAttribute("attachServices")
    public Iterable<AttachService>attachServices(){
        return attachServiceServiceImpl.findAll();
    }
    @ModelAttribute("contracts")
    public Iterable<Contract>contracts(){
        return contractServiceImpl.findAll();
    }


    @GetMapping(value = "/contractdetails")
    public String showContractDetail(Model model, @PageableDefault(value = 2)Pageable pageable){
        Page<ContractDetail> contractDetails=contractDetailServiceImpl.findAll(pageable);
        model.addAttribute("contractDetails",contractDetails);
        return "contract_detail/list";
    }
    @GetMapping(value = "create-contractdetail")
    public String showCreateContractDetail(Model model){
        ContractDetail contractDetail =new ContractDetail();
        model.addAttribute("contractDetail",contractDetail);
        return "contract_detail/create";
    }
    @PostMapping(value = "/save-contractdetail")
    public String saveContractDetail(@ModelAttribute ContractDetail contractDetail,Model model){
        contractDetailServiceImpl.save(contractDetail);
        ContractDetail contractDetail1=new ContractDetail();
        model.addAttribute("message","create ContractDetail success");
        model.addAttribute("contractDetail",contractDetail1);
        return "contract_detail/create";
    }

}
