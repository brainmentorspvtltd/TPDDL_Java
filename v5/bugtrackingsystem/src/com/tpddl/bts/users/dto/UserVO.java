package com.tpddl.bts.users.dto;

public class UserVO {
	private String userid;
	private String phone;
	private int tokenId;
	
	public int getTokenId() {
		return tokenId;
	}
	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", phone=" + phone + "]";
	}
	public UserVO(String userid, String phone) {
		super();
		this.userid = userid;
		this.phone = phone;
	}
	public UserVO() {
		
	}

}
