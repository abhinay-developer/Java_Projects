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

import com.abhi.dto.CompanyBean;
import com.abhi.service.Service;

@WebServlet("/companyurl")
public class CompanyRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Service service;

	public void init() {
		System.out.println("CompanyRegistrationServlet.init()");
		service = new Service();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CompanyRegistrationServlet.doGet()");
		CompanyBean bean = new CompanyBean();
		RequestDispatcher rd = null;
		HttpSession session = null;
		PrintWriter pw = null;
		pw = response.getWriter();
		response.setContentType("text/html");
		bean.setCompanyName(request.getParameter("companyName"));
		bean.setPassword(request.getParameter("password"));
		bean.setMobileNo(request.getParameter("mobileNo"));
		bean.setEmail(request.getParameter("email"));
		bean.setAddress(request.getParameter("address"));
		try {
			int count = service.CompanyRegisterService(bean);
			if (count == 1) {
				pw.println("Registration suceed");
			} else {
				pw.print("Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CompanyRegistrationServlet.doPost()");
		doGet(request, response);
	}

}
