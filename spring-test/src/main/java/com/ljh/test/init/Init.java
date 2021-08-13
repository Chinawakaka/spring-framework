package com.ljh.test.init;

import com.ljh.test.pojo.Student;
import com.ljh.test.service.IndexService;
import com.ljh.test.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Init.class);
//		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
//		bean.sayHi();

//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanFactory.xml");
//		Student student = classPathXmlApplicationContext.getBeanFactory().getBean(Student.class);
//		Student student = classPathXmlApplicationContext.getBean(Student.class);
//		System.out.println(student.toString());


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Init.class);
		//获取bean并且打印bean,spring默认是支持循环依赖的
		//使用api关闭循环依赖支持
		context.setAllowCircularReferences(false);

		IndexService bean = context.getBean(IndexService.class);
		System.out.println(bean);

	}
}
