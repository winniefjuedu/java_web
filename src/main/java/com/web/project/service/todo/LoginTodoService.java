package com.web.project.service.todo;

import java.util.ArrayList;
import java.util.List;

import com.web.project.model.LoginTodoVo;

public class LoginTodoService {
	private static List<LoginTodoVo> todos = new ArrayList();

	static {
		todos.add(new LoginTodoVo("Learn Web Application"));
		todos.add(new LoginTodoVo("Learn Spring"));
		todos.add(new LoginTodoVo("Learn Spring MVC"));
	}

	public List<LoginTodoVo> retrieveTodos() {
		return todos;
	}
}

