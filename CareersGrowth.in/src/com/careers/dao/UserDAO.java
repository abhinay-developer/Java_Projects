package com.careers.dao;

import com.careers.bo.UserBO;

public interface UserDAO {

	public int insertUser(UserBO bo)throws Exception;
	public int updateUser(UserBO bo)throws Exception;
	public int deleteUser(UserBO bo)throws Exception;
	public int SelectAllUsers(UserBO bo )throws Exception;
	
}
