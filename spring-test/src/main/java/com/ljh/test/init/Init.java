package com.ljh.test.init;

import com.ljh.test.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/7/24
 **/
@Configuration
@ComponentScan("com.ljh.test")
public class Init {
	public static void main(String[] args) {
		//初始化一个容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Init.class);
		context.getBeanDefinitionNames();
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();
	}
}
