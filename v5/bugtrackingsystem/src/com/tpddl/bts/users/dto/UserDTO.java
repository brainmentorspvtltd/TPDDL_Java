package com.tpddl.bts.users.dto;

public class UserDTO {
	private String userid;
	private String password;
	private String name;
	private String phone;
	private int reporting;
	private RoleDTO role;
	public UserDTO() {
		
	}
	
	public RoleDTO getRole() {
		return role;
	}

	public void setRole(RoleDTO role) {
		this.role = role;
	}

	public UserDTO(String userid, String password) {
		super();
		this.userid = userid;
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

	public int getReporting() {
		return reporting;
	}

	public void setReporting(int reporting) {
		this.reporting = reporting;
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

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", password=" + password + ", name=" + name + ", phone=" + phone
				+ ", reporting=" + reporting + ", role=" + role + "]";
	}
	

}
