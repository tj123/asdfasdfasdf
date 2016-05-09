package com.shundian.red;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:../../../../../main/webapp/WEB-INF/spring/spring-dbcp2.xml")
public class MysqlTest {

	@Autowired
	private JdbcTemplate template;
	
	@Test
	public void insert(){
		template.update("insert into user values('asdf','111','sdf阿斯顿sd','efefef')");
	}
	
	@Test
	public void createTable(){
		template.update("create table user(guid varchar(255),username varchar(255),password varchar(255),sex varchar(255))");
	}
	
}
