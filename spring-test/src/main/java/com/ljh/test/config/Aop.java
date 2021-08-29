package com.ljh.test.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/8/25
 **/
@Component
@Aspect
public class Aop {

	@Pointcut("execution(* com.ljh.test.service.*.*(..))")
	public void anyPublicMethod(){
		System.out.println("111111");
	}



	@Before("anyPublicMethod()")
	public void before() {
		System.out.println("-------------aop------------");
	}



}
