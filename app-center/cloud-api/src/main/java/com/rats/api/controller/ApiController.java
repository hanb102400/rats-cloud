package com.rats.api.controller;

import com.rats.api.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping("/helloFeign")
    public  String getProductByFeign() {
        return helloClient.hello();
    }

}
