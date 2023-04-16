package com.example.springtest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {
//    @Before("execution(* com.example.springtest.service.*.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Method called: " + joinPoint.getSignature().getName());
//    }
}
