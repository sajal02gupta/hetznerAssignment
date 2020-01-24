package com.hetzner.demo.model;

import java.util.Date;

import org.springframework.data.annotation.LastModifiedDate;

public class Iso {
	private String id;
	private String name;
	private String description;
	private String type;
	@LastModifiedDate
	private Date deprecated = new Date();
	public Iso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Iso(String id, String name, String description, String type) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDeprecated() {
		return deprecated;
	}
	public void setDeprecated(Date deprecated) {
		this.deprecated = deprecated;
	}
	
}
