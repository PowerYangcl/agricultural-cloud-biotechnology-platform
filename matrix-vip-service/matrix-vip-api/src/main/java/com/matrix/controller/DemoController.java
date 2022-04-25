package com.matrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.matrix.service.IDemoService;

@RestController
@RequestMapping("/api")
public class DemoController {
	
    @Autowired
    private IDemoService demoService;
    
    /**
     * @description: http://localhost:29011/matrix-vip-api/api/api_demo.do
     * 
     * @author Yangcl
     * @date 2022-4-22 17:21:16
     * @home https://github.com/PowerYangcl
     * @version 1.6.0.8-validation
     */
    @GetMapping(value = "/api_demo")
    public String getInfo(String msg) {
    	return demoService.demo(msg);
    }
}

























