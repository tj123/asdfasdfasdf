package com.shundian.red.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shundian.red.lib.Result;
import com.shundian.red.web.pojo.UserDto;
import com.shundian.red.web.service.RedisService;

@Controller
@RequestMapping("/redis")
public class RedisAction {
	
	@Autowired
	private RedisService service;
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Result<?> list(){
		Result<Object> res = new Result<Object>();
		return res.setData(service.listUser());
	}
	
	
	@RequestMapping("/addi")
	public String addInit(){
		return "add";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public Result<?> add(UserDto user){
		Result<Object> res = new Result<Object>();
		service.add(user);
		return res.setData(user);
	}
}
