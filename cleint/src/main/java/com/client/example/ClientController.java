package com.client.example;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Value("${endpoint.server}")
    private String serverEndpoint;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/data")
    public String getData() {
        System.out.println("Returning data from client data method");
        return "Hello from Client data method";
    }

    @GetMapping(value = "/server-data")
    public String getServerData() {
        System.out.println("Got inside  data  client server-data method");
        try {
            return restTemplate.getForObject(new URI(serverEndpoint), String.class);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return "Exception Occured....so, returning default data";
    }
}
