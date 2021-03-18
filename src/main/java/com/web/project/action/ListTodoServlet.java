package com.web.project.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.project.service.login.LoginService;
import com.web.project.service.todo.TodoService;

@WebServlet(urlPatterns = "/todo.do")
public class ListTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("todos", todoService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String todo = request.getParameter("todo");
		if ("".equals(todo)) {
			request.setAttribute("errorMessage", "Enter a valid todo");
		} else {
			todoService.addTodo(todo);
		}
		request.setAttribute("todos", todoService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
}
