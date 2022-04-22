package com.matrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import com.matrix.service.ICountryService;

@RestController
@RequestMapping("/api")
public class CountryController {
    @Autowired
    private ICountryService countryService;
    
    /**
     * @description: http://localhost:29011/matrix-vip-api/api/api_homeland.do
     * 
     * @author Yangcl
     * @date 2022-4-22 17:21:16
     * @home https://github.com/PowerYangcl
     * @version 1.6.0.8-validation
     */
    @GetMapping(value = "/api_homeland")
    public String getInfo(String homeland) {
    	return countryService.homeland(homeland);
    }
}

























