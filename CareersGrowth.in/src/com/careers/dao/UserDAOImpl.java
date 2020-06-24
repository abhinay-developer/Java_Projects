package com.careers.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.careers.bo.UserBO;

public class UserDAOImpl implements UserDAO {
	private static final String USER_INSERT = "INSERT INTO CAREERS_USER_REGISTER(FIRSTNAME,LASTNAME,PASSWORD,EMAIL,MOBILENO,ADDRESS,GENDER,RESUME)VALUES(?,?,?,?,?,?,?,?)";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int result = 0;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbUserName = "system";
	String dbPassword = "root";

	@Override
	public int insertUser(UserBO bo) throws Exception {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			ps = con.prepareStatement(USER_INSERT);
			ps.setString(1, bo.getFirstName());
			ps.setString(2, bo.getLastName());
			ps.setString(3, bo.getPassword());
			ps.setString(4, bo.getEmail());
			ps.setString(5, bo.getMobileNo());
			ps.setString(6, bo.getAddress());
			ps.setString(7, bo.getGender());
			ps.setString(8, bo.getUploadResume());
			result = ps.executeUpdate();
			if (result == 0) {
				return result;
			} else {
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		ps.close();
		con.close();
		return 0;
	}

	@Override
	public int updateUser(UserBO bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(UserBO bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int SelectAllUsers(UserBO bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
