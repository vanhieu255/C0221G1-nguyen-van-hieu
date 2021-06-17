package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SettingService {

    static List<String> listLanguages=new ArrayList<>();
    static List<Integer> listSize=new ArrayList<>();

    static {
        listLanguages.add("vietnam");
        listLanguages.add("english");
        listLanguages.add("japan");
        listSize.add(5);
        listSize.add(10);
        listSize.add(15);
        listSize.add(20);
        listSize.add(25);
    }
    public static List<String> listLanguages(){
        return listLanguages;
    }
    public static List<Integer> listSize(){
        return listSize;
    }
}
