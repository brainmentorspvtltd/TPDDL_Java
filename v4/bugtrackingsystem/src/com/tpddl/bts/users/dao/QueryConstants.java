package com.tpddl.bts.users.dao;

public interface QueryConstants {
	//String LOGIN_SQL = "select userid, name from "
			//+ "user_mst where userid=? and password=?";
	String LOGIN_SQL = " select user.userid, user.name, role.name as rolename, rig.name as rightname, rig.link from user_mst user,"
			+ " role_mst role , right_mst rig, user_role_mapping urm, role_right_mapping rrm "
			+ "where user.id =urm.userid and role.roleid=urm.roleid and rig.rightid=rrm.rightid"
			+ " and role.roleid=rrm.roleid and user.userid=? and user.password=?";
	
	String UPLOAD_USER_SQL = "insert into user_mst (id, userid, password, name, phone, reporting) values(?,?,?,?,?,?)";
	String UPLOAD_MAPPING_SQL  = "insert into user_role_mapping (userid,roleid) values(?,?)";
}
