package com.abhi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abhi.dto.RegisterDTO;
import com.abhi.service.LoginService;

@WebServlet("/registerurl")
public class RegisterServet extends HttpServlet {
	public static final long serialVersionUID = 1L;

	private LoginService service;

	public void init() {
		service = new LoginService();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegisterDTO dto;
		dto = new RegisterDTO();
		PrintWriter pw = null;
		int count = 0;

		pw = response.getWriter();
		response.setContentType("text/html");
		dto.setUsername(request.getParameter("username"));
		dto.setPassword(request.getParameter("password"));
		dto.setEmail(request.getParameter("email"));
		dto.setAddress(request.getParameter("address"));
		dto.setDateofbirth(request.getParameter("dateofbirth"));
		dto.setGender(request.getParameter("gender"));
		dto.setPicture(request.getParameter("picture"));
		dto.setMobileno(request.getParameter("mobileno"));
		try {
			count = service.Register(dto);
			if (count == 0)
				pw.println("Registration failed");
			else
				pw.println("Registration Sucessful");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
