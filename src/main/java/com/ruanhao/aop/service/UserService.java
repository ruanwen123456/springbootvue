package com.ruanhao.aop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String getUserId(Integer id) {
		System.out.println("get**************");
		return "user";
	}
	public void deleteUserById(Integer id) {
		System.out.println("delete************");
	}
}
