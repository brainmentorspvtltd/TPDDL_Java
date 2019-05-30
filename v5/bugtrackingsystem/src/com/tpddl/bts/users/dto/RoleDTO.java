package com.tpddl.bts.users.dto;

import java.util.ArrayList;

public class RoleDTO {
	private String name;
	private ArrayList<RightDTO> rights;
	
	public RoleDTO() {
		
	}
	

	public ArrayList<RightDTO> getRights() {
		return rights;
	}


	public void setRights(ArrayList<RightDTO> rights) {
		this.rights = rights;
	}


	public RoleDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RoleDTO [name=" + name + "]";
	}
	
}
