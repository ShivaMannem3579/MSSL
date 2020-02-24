package com.server.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/server")
public class ServerController {

    @GetMapping(value = "/data")
    public String getData() {
        System.out.println("Returning data from server data method");
        return "Hello from Server data method";
    }
}
