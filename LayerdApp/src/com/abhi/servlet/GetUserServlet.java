package com.abhi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abhi.dto.RegisterDTO;
import com.abhi.service.LoginService;

@WebServlet("/getuserurl")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginService service;
	

	public void init() {
		service = new LoginService();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = null;
		pw = response.getWriter();
		response.setContentType("text/html");
        String username="charan";
		RegisterDTO registerdto=service.GetUserService(username);
		System.out.println(registerdto);
		pw.println(username);
		request.setAttribute("userdetails",registerdto);
		request.getRequestDispatcher("profile.jsp").forward(request, response);
		}
	
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
