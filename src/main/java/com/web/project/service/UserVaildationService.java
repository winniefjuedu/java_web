package com.web.project.service;

public class UserVaildationService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("alice") && password.equals("123456");
	}

}
