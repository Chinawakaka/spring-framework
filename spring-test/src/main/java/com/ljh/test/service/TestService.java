package com.ljh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/8/25
 **/
@Service
public class TestService {

	@Autowired
	private UserService userService;

	public TestService(){

		new Runnable() {

			@Override
			public void run() {

			}
		};
		System.out.println("test init!!!");
	}

}
