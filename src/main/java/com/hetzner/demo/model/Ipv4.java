package com.hetzner.demo.model;

public class Ipv4 {
	private String ip;
	private boolean blocked;
	private String dns_ptr;
	
	
	public Ipv4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ipv4(String ip, boolean blocked, String dns_ptr) {
		super();
		this.ip = ip;
		this.blocked = blocked;
		this.dns_ptr = dns_ptr;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public String getDns_ptr() {
		return dns_ptr;
	}
	public void setDns_ptr(String dns_ptr) {
		this.dns_ptr = dns_ptr;
	}
	
	
}
