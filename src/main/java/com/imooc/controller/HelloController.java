package com.imooc.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;

@RestController
public class HelloController {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "Hello, SpringBoot!";
	}
	
	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		Resource bean = new Resource();
		//属性拷贝
		BeanUtils.copyProperties(resource, bean);
		return IMoocJSONResult.ok(bean);
	}
}
