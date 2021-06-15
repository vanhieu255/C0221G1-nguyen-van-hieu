package com.codegym.service.Impl.Impl;

import com.codegym.service.Impl.CheckService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class CheckServiceImpl implements CheckService {
    @Override
    public String checkDictionary(String a) {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result = dic.get(a);
        if (result != null) {
            return "Result: " + result;
        } else {
            return "Not found";
        }

    }
}
