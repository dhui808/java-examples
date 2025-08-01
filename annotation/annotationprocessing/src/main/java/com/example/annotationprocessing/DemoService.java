package com.example.annotationprocessing;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    
    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(500); // Simulate work
        System.out.println("Finished slowMethod()");
    }

    public void fastMethod() {
        System.out.println("Finished fastMethod()");
    }
}
