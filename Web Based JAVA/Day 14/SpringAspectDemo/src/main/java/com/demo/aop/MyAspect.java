package com.demo.aop;

import java.util.Scanner;

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
		System.out.println("in around advice before method call line1 transactionAdvice");
		System.out.println("in around advice before method call line 2 transactionAdvice");
		Object obj=ob.proceed();
		System.out.println("in around advice after method call line 1 transactionAdvice");
		System.out.println("in around advice after method call line 2 transactionAdvice");
		System.out.println("**************************************************");
		return obj;
		
	}
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	@Around("execution(int com.demo.beans.*.m*(..))")
	public int myadvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("before method call myadvice");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int f=factorial(n);
		int ans=(Integer) joinPoint.proceed();
		System.out.println("after call myadvice");
		return ans+f;
		
		
	}
	
	

}
