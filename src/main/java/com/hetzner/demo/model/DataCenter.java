package com.hetzner.demo.model;

public class DataCenter {
	private String id;
	private String name;
	private String description;
	private Location location;
	private ServerTypes server_types;
	public DataCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataCenter(String id, String name, String description, Location location, ServerTypes server_types) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
		this.server_types = server_types;
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
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ServerTypes getServer_types() {
		return server_types;
	}
	public void setServer_types(ServerTypes server_types) {
		this.server_types = server_types;
	}
	
	
}
