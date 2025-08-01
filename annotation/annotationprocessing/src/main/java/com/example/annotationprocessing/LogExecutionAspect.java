package com.example.annotationprocessing;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionAspect {
    @Around("@annotation(com.example.annotationprocessing.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();

        Object result = joinPoint.proceed();

        long end = System.nanoTime();
        System.out.printf("Execution time of %s: %.2f ms%n",
                joinPoint.getSignature(), (end - start) / 1_000_000.0);

        return result;
    }
}
