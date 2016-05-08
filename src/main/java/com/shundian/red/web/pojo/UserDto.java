package com.shundian.red.web.pojo;

public class UserDto {

	private String guid;
	private String username;
	private String password;
	private String sex;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passwrod) {
		this.password = passwrod;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UserDto [guid=" + guid + ", username=" + username
				+ ", passwrod=" + password + ", sex=" + sex + "]";
	}

}
