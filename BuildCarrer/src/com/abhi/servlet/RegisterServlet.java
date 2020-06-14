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

@WebServlet("/registerurl")
public class RegisterServlet extends HttpServlet {
	private Service service;
	private UserDTO dto;

	public void init() {
		System.out.println("LoginServlet.init()");

		service = new Service();
	}

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDTO dto=new UserDTO();
		System.out.println("LoginServlet.doGet()");
		PrintWriter pw = null;
		pw = response.getWriter();
		response.setContentType("text/html");
		
		dto.setFirstName(request.getParameter("firstName"));
		dto.setLastName(request.getParameter("lastName"));
		dto.setPassword(request.getParameter("password"));
		dto.setMobileNo(request.getParameter("mobileNo"));
		dto.setEmail(request.getParameter("email"));
		dto.setAddress(request.getParameter("address"));
		dto.setGender(request.getParameter("gender"));
		dto.setImage(request.getParameter("image"));
		try {

			int count = service.UserRegisterService(dto);
			if (count == 0) {
				pw.println("Registration Failed");
			} else {
				pw.println("Registartion Successful");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet.doPost()");
		doGet(request, response);
	}

}
