package com.abhi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.abhi.service.LoginService;

@WebServlet("/loginurl")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginService service;
	String username = null;
	String password = null;
	int count = 0;

	public void init() {
		service = new LoginService();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = null;
		HttpSession session = null;
		RequestDispatcher rd = null;
		pw = response.getWriter();
		response.setContentType("text/html");
		username = request.getParameter("username");
		password = request.getParameter("password");
		session = request.getSession(true);
		try {
			count = service.CheckUserLogin(username, password);
			if (count == 1) {
				pw.println("Login success");
				session.setAttribute("username", username);
				session.setAttribute("password", "password");
				rd=request.getRequestDispatcher("user_home.jsp");
				rd.forward(request, response);
				
			} else
				pw.println("<h3 style='color:red'>Login failed<h3>");
		        rd=request.getRequestDispatcher("login.jsp");
		        rd.include(request,response);

		} catch (Exception e) {

			e.printStackTrace();
			rd=request.getRequestDispatcher("/errorurl");
			rd.include(request, response);

		}
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
