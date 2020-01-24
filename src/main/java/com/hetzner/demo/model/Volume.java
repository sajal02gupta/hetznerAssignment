package com.hetzner.demo.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

public class Volume {
	@Id
	private String id;
	@CreatedDate
	private Date created = new Date();
	private String server;
	private String linux_device;
	private Protection protection;
	private Labels labels;
	private String status;
	
	private String size;
	private String name;
	private String location;
	private boolean automount;
	private String format;
	
	
	public Volume() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Volume(String size, String name, String location, boolean automount, String format) {
		super();
		this.size = size;
		this.name = name;
		this.location = location;
		this.automount = automount;
		this.format = format;
	}



	public Volume(String id, String server, String linux_device, Protection protection, Labels labels,
			String status, String size, String name, String location, boolean automount, String format) {
		super();
		this.id = id;
		this.server = server;
		this.linux_device = linux_device;
		this.protection = protection;
		this.labels = labels;
		this.status = status;
		this.size = size;
		this.name = name;
		this.location = location;
		this.automount = automount;
		this.format = format;
	}
	
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isAutomount() {
		return automount;
	}
	public void setAutomount(boolean automount) {
		this.automount = automount;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getLinux_device() {
		return linux_device;
	}
	public void setLinux_device(String linux_device) {
		this.linux_device = linux_device;
	}
	public Protection getProtection() {
		return protection;
	}
	public void setProtection(Protection protection) {
		this.protection = protection;
	}
	public Labels getLabels() {
		return labels;
	}
	public void setLabels(Labels labels) {
		this.labels = labels;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
