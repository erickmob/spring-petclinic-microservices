package com.erickmob.petclinic.vetsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class VetsController {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String home() {
        // This is useful for debugging
        // When having multiple instance of this service running at different ports.
        // We load balance among them, and display which instance received the request.
        return "Hello from Vets Service running at port: " + env.getProperty("local.server.port");
    }
}
