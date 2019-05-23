package com.tpddl.bts.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.tpddl.bts.users.dto.UserDTO;
import com.tpddl.bts.utils.dao.CommonDAO;

public class UserDAO implements QueryConstants {
	
	public UserDTO login(UserDTO userDTO) throws SQLException, NamingException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserDTO userObject = null;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				userObject = new UserDTO();
				userObject.setName(rs.getString("name"));
				userObject.setUserid(rs.getString("userid"));
			}
			
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return userObject;
	}
	
	public void register(UserDTO userDTO) {
		
	}

}
