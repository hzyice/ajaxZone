package com.hzyice.ajaxserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get1")
    public ResultBean get1(){
        System.out.println("TestController get1");
        return new ResultBean("get1 OK");
    }


}
