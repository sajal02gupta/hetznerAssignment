package com.hetzner.demo.model;

import java.util.List;

public class PrivateNet {
	private int network;
	private String ip;
	private List<String> alias_ips;
	private String mac_address;
	public PrivateNet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrivateNet(int network, String ip, List<String> alias_ips, String mac_address) {
		super();
		this.network = network;
		this.ip = ip;
		this.alias_ips = alias_ips;
		this.mac_address = mac_address;
	}
	public int getNetwork() {
		return network;
	}
	public void setNetwork(int network) {
		this.network = network;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public List<String> getAlias_ips() {
		return alias_ips;
	}
	public void setAlias_ips(List<String> alias_ips) {
		this.alias_ips = alias_ips;
	}
	public String getMac_address() {
		return mac_address;
	}
	public void setMac_address(String mac_address) {
		this.mac_address = mac_address;
	}
	
	
}
