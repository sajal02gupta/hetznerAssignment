package com.hetzner.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ServerRequest {
	@Id
	private String id;
	private String name; // The only attribute that should be set when changing a server's name
	@JsonProperty("server_type")
	private String server_type;
	private String location;
	@JsonProperty("start_after_create")
	private boolean start_after_create;
	private String image;
	private List<Long> volumes;
	private List<Integer> networks;
	@JsonProperty("user_data")
	private String user_data;
	private boolean automount;
	
	
	public ServerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ServerRequest(String name, String server_type, String location, boolean start_after_create,
			String image, List<Long> volumes, List<Integer> networks, String user_data,
			boolean automount) {
		super();
		this.name = name;
		this.server_type = server_type;
		this.location = location;
		this.start_after_create = start_after_create;
		this.image = image;
		this.volumes = volumes;
		this.networks = networks;
		this.user_data = user_data;
		this.automount = automount;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public List<Long> getVolumes() {
		return volumes;
	}



	public void setVolumes(List<Long> volumes) {
		this.volumes = volumes;
	}



	public List<Integer> getNetworks() {
		return networks;
	}



	public void setNetworks(List<Integer> networks) {
		this.networks = networks;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public String getServer_type() {
		return server_type;
	}




	public void setServer_type(String server_type) {
		this.server_type = server_type;
	}




	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isStart_after_create() {
		return start_after_create;
	}

	public void setStart_after_create(boolean start_after_create) {
		this.start_after_create = start_after_create;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUser_data() {
		return user_data;
	}
	public void setUser_data(String user_data) {
		this.user_data = user_data;
	}
	public boolean isAutomount() {
		return automount;
	}

	public void setAutomount(boolean automount) {
		this.automount = automount;
	}
	
	

}