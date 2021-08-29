package com.ljh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/8/12
 **/
@Service
public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService(){
		System.out.println("user init!!!");
	}


	public IndexService getIndexService(){
		return indexService;
	}

//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName){
//		System.out.println("对象初始化前！！！" + beanName);
//		return bean;
//	}
//
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName){
//		System.out.println("对象初始化后！！！" + beanName);
//		return bean;
//	}



}
