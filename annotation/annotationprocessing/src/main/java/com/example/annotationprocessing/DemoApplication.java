package com.example.annotationprocessing;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoApplication implements org.springframework.boot.CommandLineRunner {

    private final DemoService demoService;

    @Autowired
    public DemoApplication(DemoService demoService) {
        this.demoService = demoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        demoService.slowMethod();
        demoService.fastMethod();
    }
}