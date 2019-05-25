package com.rats.api.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="cloud-service")
public interface  HelloClient {

    @GetMapping("/hello")
    String hello();
}
