package com.hetzner.demo.model;

public class Resources {
	private String id;
	private String type;
	public Resources() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resources(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
