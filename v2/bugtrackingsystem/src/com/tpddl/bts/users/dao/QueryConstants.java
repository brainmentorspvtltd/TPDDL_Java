package com.tpddl.bts.users.dao;

public interface QueryConstants {
	String LOGIN_SQL = "select userid, name from "
			+ "user_mst where userid=? and password=?";
}
