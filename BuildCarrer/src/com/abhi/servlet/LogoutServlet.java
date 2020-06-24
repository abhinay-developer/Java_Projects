package com.abhi.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abhi.service.Service;

@WebServlet("/logouturl")
public class LogoutServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;
	private Service service;

	public void init() {
		System.out.println("LoginServlet.init()");

		service = new Service();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = null;
		RequestDispatcher rd = null;
		session = request.getSession(false);
		session.removeAttribute("firsName");
		session.removeAttribute("password");
		System.out.println(session);
		rd = request.getRequestDispatcher("user_login.jsp");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
