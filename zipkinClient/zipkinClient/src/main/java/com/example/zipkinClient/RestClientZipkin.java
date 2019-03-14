package com.example.zipkinClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestClientZipkin {

    @GetMapping("/")
    public String gethello()
    {
        return "hello";
    }
}
