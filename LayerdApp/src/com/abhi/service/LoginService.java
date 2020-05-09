package com.abhi.service;

import com.abhi.dao.LoginDAO;
import com.abhi.dto.ProductsDTO;
import com.abhi.dto.RegisterDTO;

public class LoginService {

	private LoginDAO dao;
	private RegisterDTO dto;
	private ProductsDTO pdto;

	public int CheckUserLogin(String username, String password)throws Exception {

		dao = new LoginDAO();
		return dao.CheckUserLoginByParameters(username, password);
      
	}
	public int  Register(RegisterDTO dto)throws Exception
	{
		dao=new LoginDAO();
		return dao.RegistrationbyParamametrs(dto);
	}
	public RegisterDTO GetUserService(String username)
	{  
		dao=new LoginDAO();
		return dao.GetProfile(username);
	}
	public int  AddProductsService(ProductsDTO pdto)throws Exception
	{
		dao=new LoginDAO();
		return dao.AddProducts(pdto);
	}
	public ProductsDTO GetProductsService(String heading)
	{
		dao=new LoginDAO();
		return dao.GetProducts(heading);
	}
	

}