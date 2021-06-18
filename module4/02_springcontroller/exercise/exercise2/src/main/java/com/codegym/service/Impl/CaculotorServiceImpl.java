package com.codegym.service.Impl;

import com.codegym.service.CaculatorService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CaculotorServiceImpl implements CaculatorService {

    @Override
    public double caculator(double a, double b, String c) {
        Double result= 0.0;
        switch (c){
            case "Addition(+)" :
                result=a+b;
                break;
            case "Subtraction(-)":
                result=a-b;
                break;
            case "Multiplication(*)":
                result=a*b;
                break;
            case "Division(/)":
                result=a/b;
                break;

        }
        return result;
    }
}
