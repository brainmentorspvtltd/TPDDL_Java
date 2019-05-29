package com.tpddl.bts.utils;

public class XLSDTO {
	private int id;
	private String userid;
	private String password;
	private String name;
	private String phone;
	private int reportingId;
	private int roleId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getReportingId() {
		return reportingId;
	}
	public void setReportingId(int reportingId) {
		this.reportingId = reportingId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "XLSDTO [id=" + id + ", userid=" + userid + ", password=" + password + ", name=" + name + ", phone="
				+ phone + ", reportingId=" + reportingId + ", roleId=" + roleId + "\n]";
	}
	

}
