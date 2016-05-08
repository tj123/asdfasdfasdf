package com.shundian.red.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shundian.red.web.dao.RedisDao;
import com.shundian.red.web.pojo.UserDto;

@Repository
public class RedisDaoImpl implements RedisDao{

	
	@Autowired
	private JdbcTemplate db;
	
	public void add(UserDto user) {
		String sql = "insert into user value(?,?,?,?)";
		db.update(sql, user.getGuid(),user.getUsername(),user.getPassword(),user.getSex());
	}

	public List<Map<String, Object>> listUser() {
		String sql = "select * from user";
		return db.queryForList(sql);
	}

	
}
