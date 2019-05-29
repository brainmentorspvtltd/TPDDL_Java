package com.tpddl.bts.utils.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.tpddl.bts.utils.CommonConstants;

public interface CommonDAO {
	public static Connection getConnection() throws NamingException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle(CommonConstants.CONFIG_NAME);
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:comp/env");
		DataSource ds = (DataSource) envContext.lookup(rb.getString(CommonConstants.JNDI_NAME));
		Connection con = null;
		con = ds.getConnection();
		return con;
		
	}

}
