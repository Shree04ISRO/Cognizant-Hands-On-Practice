package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.addBook(..))")
    public void beforeAdvice() {
        System.out.println("Before addBook() method");
    }

    @After("execution(* com.library.service.BookService.addBook(..))")
    public void afterAdvice() {
        System.out.println("After addBook() method");
    }
}