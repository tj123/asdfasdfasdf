package com.shundian.red.web.dao;

import java.util.List;
import java.util.Map;

import com.shundian.red.web.pojo.UserDto;

public interface RedisDao {

	void add(UserDto user);

	List<Map<String, Object>> listUser();

}
