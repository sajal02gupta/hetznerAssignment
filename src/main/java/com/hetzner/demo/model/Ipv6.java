package com.hetzner.demo.model;

import java.util.List;

public class Ipv6 {
	private String ip;
	private boolean blocked;
	private List<Dnsptr> dns_ptr;
	public Ipv6() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ipv6(String ip, boolean blocked, List<Dnsptr> dns_ptr) {
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
	public List<Dnsptr> getDns_ptr() {
		return dns_ptr;
	}
	public void setDns_ptr(List<Dnsptr> dns_ptr) {
		this.dns_ptr = dns_ptr;
	}
	
	
}
