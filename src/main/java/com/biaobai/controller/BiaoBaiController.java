package com.biaobai.controller;

import com.biaobai.service.BiaoBaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("love")
public class BiaoBaiController {

    @Autowired
    private BiaoBaiService biaoBaiService;

    @GetMapping
    public void love(){
        biaoBaiService.biaoBai();
    }

    @GetMapping("/test")
    public String test(){
        return "test...";
    }
}
