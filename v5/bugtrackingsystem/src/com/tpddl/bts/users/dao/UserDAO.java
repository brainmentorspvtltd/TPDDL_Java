package com.tpddl.bts.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.tpddl.bts.users.dto.RightDTO;
import com.tpddl.bts.users.dto.RoleDTO;
import com.tpddl.bts.users.dto.UserDTO;
import com.tpddl.bts.utils.dao.CommonDAO;

public class UserDAO implements QueryConstants {
	
	public UserDTO login(UserDTO userDTO) throws SQLException, NamingException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserDTO userObject = null;
		ArrayList<RightDTO> rights = new ArrayList<>();
		boolean isFound = false;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				userObject = new UserDTO();
				userObject.setName(rs.getString("name"));
				userObject.setUserid(rs.getString("userid"));
				userObject.setPhone(rs.getString("phone"));
				RoleDTO roleDTO = new RoleDTO();
				roleDTO.setName(rs.getString("rolename"));
				userObject.setRole(roleDTO);
				
				RightDTO rightDTO = new RightDTO();
				rightDTO.setName(rs.getString("rightname"));
				rightDTO.setLink(rs.getString("link"));
				rights.add(rightDTO);
				roleDTO.setRights(rights);
				isFound = true;
				
			}
			if(!isFound) {
				return null;
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
