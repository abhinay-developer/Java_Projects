package com.abhi.service;

import com.abhi.dao.LoginDAO;

public class LoginService {

	private LoginDAO dao;

	public int CheckUserLogin(String username, String password)throws Exception {

		dao = new LoginDAO();
		return dao.CheckUserLoginByParameters(username, password);
      
	}

}
