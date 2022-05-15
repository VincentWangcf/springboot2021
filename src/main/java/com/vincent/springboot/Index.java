package com.vincent.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Index {
    private Map map = new HashMap();



    @PostMapping(value = "/index")
    public String index() {
        //todo
        map.put("date",new Date());
        return "1";
    }
}
