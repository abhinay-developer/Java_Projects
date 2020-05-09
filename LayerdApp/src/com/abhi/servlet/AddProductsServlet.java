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

@WebServlet("/addproductsurl")
public class AddProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService service;

	public void init() {
		service = new LoginService();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      ProductsDTO pdto;
	      int count=0;
		PrintWriter pw=null;
		pw=response.getWriter();
        response.setContentType("text/html");
        pdto=new ProductsDTO();
        pdto.setHeading(request.getParameter("heading"));
        pdto.setSearchkeyword(request.getParameter("searchkeyword"));
        pdto.setDescription(request.getParameter("description"));
        try
        {
        	count=service.AddProductsService(pdto);
        	
        	if(count==0)
        		pw.println("Failed to add products");
        	else
        		pw.println("Products added successfully");
        }
        catch (Exception e) {
        e.printStackTrace();
        }
        
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
