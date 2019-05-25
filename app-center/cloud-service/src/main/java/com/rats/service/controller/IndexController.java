package com.rats.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class IndexController {

    @Value("${version}")
    String version;

    @RequestMapping("/hello")
    String hello() {
        return "Hello World!" + version;
    }
}

