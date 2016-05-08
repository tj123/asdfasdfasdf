package com.shundian.red.web.service;

import java.util.List;
import java.util.Map;

import com.shundian.red.web.pojo.UserDto;

public interface RedisService {

	public void add(UserDto user);

	public List<Map<String, Object>> listUser();

}
