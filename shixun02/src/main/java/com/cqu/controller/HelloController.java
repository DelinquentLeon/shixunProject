package com.cqu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * spring mvc 的框架
 * m:model
 * v:view
 * c:controller
 * 
 * 
 * */
@Controller
public class HelloController {
	
	//请求映射
	@RequestMapping("hello")
	//以JSON格式进行响应数据到页面的body
	@ResponseBody
	public String hello(){
		return "hello world!";
	}
}
