package com.hatha.system.controller;

import com.hatha.system.domain.Test;
import com.hatha.system.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;



    @RequestMapping("/test")
    public List<Test> test(){
        return testService.list();
    }

}
