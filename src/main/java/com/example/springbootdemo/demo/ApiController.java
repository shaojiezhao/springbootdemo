package com.example.springbootdemo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/girl")
public class ApiController
{
    @Value("${girl.name}")
    private String girlName;

    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello " + girlName;
    }

}
