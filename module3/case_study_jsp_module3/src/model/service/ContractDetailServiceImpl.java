package model.service;

import model.bean.Contract;
import model.bean.ContractDetail;
import model.bean.ServiceAttach;
import model.repository.ContractDetailRepository;
import model.repository.ContractRepository;

import java.sql.SQLException;
import java.util.List;

public class ContractDetailServiceImpl implements ContractDetailService {
    ContractDetailRepository contractDetailRepository= new ContractDetailRepository();
    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public List<Contract> findAllContract() {
        return contractDetailRepository.findAllContract();
    }

    @Override
    public List<ServiceAttach> findAllServiceAttach() {
        return contractDetailRepository.findAllServiceAttach();
    }

    @Override
    public void save(ContractDetail contractDetail) throws SQLException {
        contractDetailRepository.save(contractDetail);
    }
}
