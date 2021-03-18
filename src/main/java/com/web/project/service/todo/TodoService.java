package com.web.project.service.todo;

import java.util.ArrayList;
import java.util.List;

import com.web.project.model.TodoVo;

public class TodoService {
	private static List<TodoVo> todos = new ArrayList();

	static {
		todos.add(new TodoVo("Learn Web Application"));
		todos.add(new TodoVo("Learn Spring"));
		todos.add(new TodoVo("Learn Spring MVC"));
	}

	public List<TodoVo> retrieveTodos() {
		return todos;
	}
	
	public void addTodo(String todo) {
		todos.add(new TodoVo(todo));
	}

	public void deleteTodo(String todo) {
		todos.remove(new TodoVo(todo));
	}
}

