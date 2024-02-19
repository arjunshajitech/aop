package com.arjunshaji.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AspectConfig {


//    @Before("execution(* com.arjunshaji.aop.aop..*.*(..))")
//    public void authorization() {
//        // authorization performs here
//        log.info("authorization performed..................");
//    }
//
//    @Before("execution(* com.arjunshaji.aop.aop..*.*(..))")
//    public void authentication() {
//        // authentication performs here
//        log.info("authentication performed...................");
//    }
//
//    @Before("execution(* com.arjunshaji.aop.aop.AspectController.order(..))")
//    public void beforeLogging() {
//        log.info("order creation started............");
//    }
//
//    @After("execution(* com.arjunshaji.aop.aop.AspectController.order(..))")
//    public void afterLogging() {
//        log.info("order creation completed............");
//    }
//
//
//    @Before("execution(* com.arjunshaji.aop.aop.AspectController.order(..))")
//    public void jsonValidate(JoinPoint joinPoint) {
//        log.info("validating json................");
//        Object[] args = joinPoint.getArgs();
//        for (Object arg : args) {
//            System.out.println("amount : " + arg);
//        }
//    }

    // aspect = jsonValidate
    // pointcut = execution(* com.arjunshaji.aop.aop.AspectController.order(..))")
    // advice - before
    // joinPoint - get metadata
    // * any return type
    // (..) any number of arguments

//    @Around("execution(* com.arjunshaji.aop.aop.AspectController.order(..))")
//    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("Before executing the order method...");
//        Object sampleReturnValue = "SampleReturnValue";
//        System.out.println("After executing the order method...");
//        return sampleReturnValue;
//    }

}
