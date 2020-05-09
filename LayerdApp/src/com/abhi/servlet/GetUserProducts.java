package com.abhi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abhi.dto.ProductsDTO;
import com.abhi.service.LoginService;


@WebServlet("/getuserproductsurl")
public class GetUserProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginService service;
	

	public void init() {
		service = new LoginService();

	}
  
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter pw = null;
	pw = response.getWriter();
	response.setContentType("text/html");
    String heading="iphone";
    ProductsDTO productsdto=service.GetProductsService(heading);
	System.out.println(productsdto);
	pw.println(heading);
	//request.setAttribute("productsdetails",productsdto);
//	request.getRequestDispatcher("view_products.jsp").forward(request, response);
	}




	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
