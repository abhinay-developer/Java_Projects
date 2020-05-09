package com.abhi.service;

import com.abhi.dao.LoginDAO;
import com.abhi.dto.RegisterDTO;

public class LoginService {

	private LoginDAO dao;
	private RegisterDTO dto;

	public int CheckUserLogin(String username, String password)throws Exception {

		dao = new LoginDAO();
		return dao.CheckUserLoginByParameters(username, password);
      
	}
	public int  Register(RegisterDTO dto)throws Exception
	{
		dao=new LoginDAO();
		return dao.RegistrationbyParamametrs(dto);
	}

}