package com.hetzner.demo.model;

import java.util.List;

public class ServerTypes {
	List<Integer> supported;
	List<Integer> available;
	List<Integer> available_for_migration;
	public ServerTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServerTypes(List<Integer> supported, List<Integer> available, List<Integer> available_for_migration) {
		super();
		this.supported = supported;
		this.available = available;
		this.available_for_migration = available_for_migration;
	}
	public List<Integer> getSupported() {
		return supported;
	}
	public void setSupported(List<Integer> supported) {
		this.supported = supported;
	}
	public List<Integer> getAvailable() {
		return available;
	}
	public void setAvailable(List<Integer> available) {
		this.available = available;
	}
	public List<Integer> getAvailable_for_migration() {
		return available_for_migration;
	}
	public void setAvailable_for_migration(List<Integer> available_for_migration) {
		this.available_for_migration = available_for_migration;
	}
	
}
