package com.ljh.test.init;

import com.ljh.test.pojo.Person;
import com.ljh.test.pojo.Student;
import com.ljh.test.service.IndexService;
import com.ljh.test.service.UserService;
import com.ljh.test.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/7/24
 **/
@Configuration
@ComponentScan("com.ljh.test")
@EnableAspectJAutoProxy
public class Init {
	public static void main(String[] args) {
		//初始化一个容器
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register();
//		context.setAllowCircularReferences(true);
//		context.refresh();


//		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
//		bean.sayHi();

//		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("beanFactory.xml");
//		Person person = context1.getBean(Person.class);
//		System.out.println(person.toString());
//		Student student = classPathXmlApplicationContext.getBeanFactory().getBean(Student.class);
//		Student student = classPathXmlApplicationContext.getBean(Student.class);
//		System.out.println(student.toString());


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Init.class);
		//获取bean并且打印bean,spring默认是支持循环依赖的
		//使用api关闭循环依赖支持,写在后面没有用，要手动refresh方法之前set
		context.setAllowCircularReferences(true);

		UserService bean = context.getBean(UserService.class);
//		IndexService indexService = context.getBean(IndexService.class);
//		UserService userService = indexService.getUserService();
//		IndexService indexService2 = userService.getIndexService();
//		System.out.println(userService);


//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("beanFactory.xml");
//		Person person = context.getBean(Person.class);
//		System.out.println(person.toString());
	}

//	@PostConstruct
//	public void test(){
//		System.out.println("这是PostConstruct注解");
//	}


}
