package com.web.project.service.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		if (user.equalsIgnoreCase("alice") && password.equals("123456")){
			return true;
		}
		else return false; 
	}

}
