package com.erickmob.petclinic.vetsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class VetsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VetsServiceApplication.class, args);
    }

}
