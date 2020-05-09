package com.abhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	private static final String ADMIN_LOGIN = "SELECT COUNT(*) FROM ADMIN_LOGIN WHERE USERNAME=? AND PASSWORD=?";

	public int CheckUserLoginByParameters(String username, String password)throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			ps = con.prepareStatement(ADMIN_LOGIN);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs != null) {
				if (rs.next())
					count = rs.getInt(1);
			}
			if (count == 0) {
				return count;

			} else {
				return count;
			}
		}

		catch (Exception e) {

			{
				e.printStackTrace();
			}

		}

		return 0;
	}
}
