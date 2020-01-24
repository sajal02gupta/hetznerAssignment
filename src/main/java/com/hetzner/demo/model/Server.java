package com.hetzner.demo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;



public class Server {
	private String id;
	private String name;
	private String status;
	@CreatedDate
	private Date created= new Date();
	private PublicNet public_net;
	private List<PrivateNet> private_net;
	
	private ServerType server_type;
	private DataCenter datacenter;
	
	public Server() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Server(String id, String name, String status, PublicNet public_net,
			List<PrivateNet> private_net, ServerType server_type, DataCenter datacenter) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.public_net = public_net;
		this.private_net = private_net;
		this.server_type = server_type;
		this.datacenter = datacenter;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public PublicNet getPublic_net() {
		return public_net;
	}
	public void setPublic_net(PublicNet public_net) {
		this.public_net = public_net;
	}
	public List<PrivateNet> getPrivate_net() {
		return private_net;
	}
	public void setPrivate_net(List<PrivateNet> private_net) {
		this.private_net = private_net;
	}
	public ServerType getServer_type() {
		return server_type;
	}
	public void setServer_type(ServerType server_type) {
		this.server_type = server_type;
	}
	public DataCenter getDatacenter() {
		return datacenter;
	}
	public void setDatacenter(DataCenter datacenter) {
		this.datacenter = datacenter;
	}
	
	
}
