package com.tpddl.bts.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.tpddl.bts.utils.XLSDTO;
import com.tpddl.bts.utils.dao.CommonDAO;

public class UploadDAO  implements QueryConstants{
	public boolean upload(ArrayList<XLSDTO> list) throws SQLException, NamingException {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		boolean isFailed = true;
		try {
			con = CommonDAO.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(UPLOAD_USER_SQL);
			pstmt2 = con.prepareStatement(UPLOAD_MAPPING_SQL);
			if(list!=null && list.size()>0) {
			for(XLSDTO xlsDTO : list) {
				if(xlsDTO!=null) {
			
			pstmt.setInt(1, xlsDTO.getId());
			pstmt.setString(2, xlsDTO.getUserid());
			pstmt.setString(3, xlsDTO.getPassword());
			pstmt.setString(4, xlsDTO.getName());
			pstmt.setString(5, xlsDTO.getPhone());
			pstmt.setInt(6, xlsDTO.getReportingId());
			pstmt.addBatch();
			
			pstmt2.setInt(1, xlsDTO.getId());
			
			pstmt2.setInt(2, xlsDTO.getRoleId());
			//pstmt.addBatch();
			pstmt2.addBatch();
			
				}
			
			}
			int results[]= pstmt.executeBatch();
			int res2[] = pstmt2.executeBatch();
			con.commit();
			isFailed = false;
			}
		}
		finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return isFailed;
		
	}

}
