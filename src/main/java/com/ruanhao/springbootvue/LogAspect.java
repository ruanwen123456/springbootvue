package com.ruanhao.springbootvue;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {

	//aop切入点
	@Pointcut("execution(public * com.ruanhao.springbootvue.*.*(..))")
	public void pcl() {
		
	}
	//方法执行之前
	@Before(value = "pcl()")
	public void before(JoinPoint jp) {
		String name = jp.getSignature().getName();
		System.out.println(name+"方法开始执行");
	}
	//方法之后执行
	@After(value = "pcl()")
	public void after(JoinPoint jp) {
		String name = jp.getSignature().getName();
		System.out.println(name+"方法执行结束");
	}
	//方法执行结束 返回通知
	@AfterReturning(value = "pcl()",returning="result")
	public void after(JoinPoint jp,Object result) {
		String name = jp.getSignature().getName();
		System.out.println(name+"方法返回值为"+result);
	}
	//方法异常
	@AfterThrowing(value = "pcl()",throwing="e")
	public void afterThrowing(JoinPoint jp,Exception e) {
		String name = jp.getSignature().getName();
		System.out.println(name+"方法抛出异常:"+e.getMessage());
	}
	//环绕通知
	@Around("pcl()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		return pjp.proceed();
	}
	
	
	
	
	
	
}
