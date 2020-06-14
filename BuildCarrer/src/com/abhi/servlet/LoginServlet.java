package com.abhi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abhi.dao.DataAccessObject;
import com.abhi.dto.UserDTO;
import com.abhi.service.Service;

@WebServlet("/loginurl")
public class LoginServlet extends HttpServlet {
	private Service service;
	public void init() {
		System.out.println("LoginServlet.init()");
		
		service=new Service();
	}
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("LoginServlet.doGet()");
	PrintWriter pw=null;
	String firstName=null;
	String password=null;
	pw=response.getWriter();
	response.setContentType("text/html");
	firstName=request.getParameter("userName");
	password=request.getParameter("password");
	try {
		int count=service.UserLogin(firstName, password);
		if(count==1) {
			pw.println("<h3 style='color:green'>Login sucess</h3>");
		}
		else {
			pw.print("<h3 style='color:red'>Failed</h3>");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("LoginServlet.doPost()");
		doGet(request, response);
	}

}
