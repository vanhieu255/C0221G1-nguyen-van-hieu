package model.service;

import model.bean.*;

import java.sql.SQLException;
import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> findAll();
    public List<Contract> findAllContract();
    public List<ServiceAttach> findAllServiceAttach();
    void save(ContractDetail contractDetail) throws SQLException;

}
