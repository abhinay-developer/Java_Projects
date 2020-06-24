package com.careers.service;

import com.careers.bo.UserBO;
import com.careers.dao.UserDAO;
import com.careers.dao.UserDAOImpl;

public class CareersServiceImpl implements Careers {
	 private UserDAO dao;

	@Override
	public int insertService(UserBO bo) throws Exception {
		dao=new UserDAOImpl();
		return dao.insertUser(bo);
	}

}
