package com.careers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careers.bo.UserBO;
import com.careers.service.Careers;
import com.careers.service.CareersServiceImpl;

@WebServlet("/registerurl")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter pw = null;
	RequestDispatcher rd = null;
	int result = 0;
	private UserBO bo;
	private Careers careers;

	@Override
	public void init() throws ServletException {

		careers=new CareersServiceImpl();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		bo = new UserBO();
		pw = response.getWriter();
		response.setContentType("text/html");
		bo.setFirstName(request.getParameter("firstName"));
		bo.setLastName(request.getParameter("lastName"));
		bo.setPassword(request.getParameter("password"));
		bo.setEmail(request.getParameter("email"));
		bo.setMobileNo(request.getParameter("mobileNo"));
		bo.setAddress(request.getParameter("address"));
		bo.setGender(request.getParameter("gender"));
		bo.setUploadResume(request.getParameter("uploadResume"));
		
		try {
			result = careers.insertService(bo);
             if(result==1) {
            	 pw.println("<h3 style='color:green'>Sucessfully Registered<h3>");             
             }
             else {
            	 pw.println("<h3 style='color:red'>Registartion Failed<h3>"); 
             }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
