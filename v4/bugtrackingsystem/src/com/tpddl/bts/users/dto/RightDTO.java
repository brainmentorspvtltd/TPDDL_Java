package com.tpddl.bts.users.dto;

public class RightDTO {
	private String name;
	private String link;
	public RightDTO() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public RightDTO(String name, String link) {
		super();
		this.name = name;
		this.link = link;
	}
	@Override
	public String toString() {
		return "RightDTO [name=" + name + ", link=" + link + "]";
	}
	
}
