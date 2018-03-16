package com.imooc.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setName("张三");
		user.setPassword("123456");
		user.setAge(13);
		user.setBirthday(new Date(System.currentTimeMillis()));
		user.setDesc("我是张三");
		return user;
	}
	
	@RequestMapping("/getUserJson")
	public IMoocJSONResult getUserJson() {
		User user = new User();
		user.setName("张三");
		user.setPassword("123456");
		user.setAge(13);
		user.setBirthday(new Date(System.currentTimeMillis()));
		user.setDesc(null);
		return IMoocJSONResult.ok(user);
	}
}
