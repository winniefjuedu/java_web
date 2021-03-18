package com.web.project.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.project.model.TodoVo;
import com.web.project.service.login.LoginService;
import com.web.project.service.todo.TodoService;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String newTodo = request.getParameter("todo");
		todoService.addTodo(new TodoVo(newTodo));
		response.sendRedirect("/todo.do");
	}
}