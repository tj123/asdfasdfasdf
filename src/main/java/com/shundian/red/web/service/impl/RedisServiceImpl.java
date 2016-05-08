package com.shundian.red.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shundian.red.web.dao.RedisDao;
import com.shundian.red.web.pojo.UserDto;
import com.shundian.red.web.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService{

	@Autowired
	private RedisDao dao;
	
	public void add(UserDto user) {
		
		dao.add(user);
	}

	public List<Map<String, Object>> listUser() {
		return dao.listUser();
	}

}
