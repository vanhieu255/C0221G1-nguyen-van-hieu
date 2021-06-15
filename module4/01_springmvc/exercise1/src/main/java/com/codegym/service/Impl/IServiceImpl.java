package com.codegym.service.Impl;

import com.codegym.service.IService;
import org.springframework.stereotype.Service;

@Service
public class IServiceImpl implements IService {


    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }
}
