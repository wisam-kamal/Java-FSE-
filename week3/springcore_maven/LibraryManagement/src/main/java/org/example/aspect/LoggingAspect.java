package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Before("execution(* org.example.service.BookService.addBook(..))")
    public void logBefore() {
        System.out.println("AOP @Before: BookService.addBook() is about to be called.");
    }

    @After("execution(* org.example.service.BookService.addBook(..))")
    public void logAfter() {
        System.out.println("AOP @After: BookService.addBook() has completed.");
    }

    @Around("execution(* org.example.service.BookService.addBook(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("AOP @Around: Execution Time: " + (end - start) + "ms");

        return result;
    }
}
