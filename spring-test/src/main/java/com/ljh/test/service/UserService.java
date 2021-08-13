package com.ljh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
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


}
