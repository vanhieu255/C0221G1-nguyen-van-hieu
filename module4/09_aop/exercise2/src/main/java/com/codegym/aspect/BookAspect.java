package com.codegym.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
@Aspect
public class BookAspect  {
    private static int count=0;

    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @AfterReturning("execution(* com.codegym.controller.BookController.*(..))")
    public void logAfterMethodReturn(JoinPoint joinPoint){
        String nameMethod=joinPoint.getSignature().getName();
        String args= Arrays.toString(joinPoint.getArgs());
        logger.error("ten phuong thuc:"+nameMethod);
        logger.error(("cac tham so la :")+args);
        logger.error("số lần vào trang chính:"+ ++count + "thời gian :"+ LocalDate.now());
    }
}
