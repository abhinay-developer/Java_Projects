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

import com.abhi.service.Service;

@WebServlet("/companyloginurl")
public class CompanyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Service service;

	public void init() {
		service = new Service();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = null;
		RequestDispatcher rd = null;
		HttpSession session = null;
		response.setContentType("text/html");
		pw = response.getWriter();
		String companyName = request.getParameter("companyName");
		String password = request.getParameter("password");
		int count = 0;
		try {
			count = service.CompanyLoginService(companyName, password);
			if (count == 1) {
				pw.println("Login success");
				session = request.getSession(true);
				session.setAttribute("comapanyName", companyName);
				session.setAttribute("password", password);
				rd = request.getRequestDispatcher("company_home.jsp");
				rd.forward(request, response);
			} else {
				pw.println("Login Failed");
				rd = request.getRequestDispatcher("company_login.jsp");
				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
