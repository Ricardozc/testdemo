package com.example.demo.controller;

import com.example.demo.dao.TestDao;
import com.example.demo.pojo.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("testtest")
    @ResponseBody
    public void lombokTest() {
        Test test = new Test();

        System.out.println(testService.getAll()+"11111");
    }
}
