package com.example.hystrix;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerHystrix {
    @HystrixCommand
    @GetMapping("/")
    public String getname()
    {
        return "hello";
    }


}
