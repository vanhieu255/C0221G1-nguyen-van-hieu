package com.codegym.model.entity.contract_detail;

import com.codegym.model.entity.attach_service.AttachService;
import com.codegym.model.entity.contract.Contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "attach_service_id",referencedColumnName = "id")
    private AttachService attachService;

    @ManyToOne
    @JoinColumn(name = "contract_id",referencedColumnName = "id")
    private Contract contract;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(Integer id, AttachService attachService, Contract contract, int quantity) {
        this.id = id;
        this.attachService = attachService;
        this.contract = contract;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
