package com.example.springtest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* com.example.springtest.service.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed(); // Invoke the target method
        System.out.println("After method: " + joinPoint.getSignature().getName());

        if (result instanceof String) {
            result = "Modified: " + result; // Modify the return value
        }
        return result;
    }
}
