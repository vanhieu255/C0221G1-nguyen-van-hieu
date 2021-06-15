package com.codegym.service.Impl;

import com.codegym.service.ISumService;
import org.springframework.stereotype.Service;

@Service
public class SumService implements ISumService {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
