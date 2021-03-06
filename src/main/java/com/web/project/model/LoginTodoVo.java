package com.web.project.model;

import java.io.Serializable;

public class LoginTodoVo {	
	public LoginTodoVo(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + "]";
	}

}
