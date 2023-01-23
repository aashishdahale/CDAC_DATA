package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before("execution(* com.demo.beans.MyClass.set*(int))")
	public void securityAdvice() {
		System.out.println("in security advice, before advice");
	}
	
	@After("execution(* com.demo.beans.MyClass.*(..))")
	public void loggingAdvice() {
		System.out.println("in logging advice,after advice");
	}
	
	@Around("execution(* com.demo.beans.MyClass.*(..))")
	public Object transactionAdvice(ProceedingJoinPoint ob) throws Throwable {
		System.out.println("in around advice before method call line1");
		System.out.println("in around advice before method call line 2");
		Object obj=ob.proceed();
		System.out.println("in around advice after method call line 1");
		System.out.println("in around advice after method call line 2");
		return obj;	
	}
}
