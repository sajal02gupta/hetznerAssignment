package com.hetzner.demo.model;

public class Protection {
	private boolean delete;
	private boolean rebuild;
	
	
	public Protection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isRebuild() {
		return rebuild;
	}


	public void setRebuild(boolean rebuild) {
		this.rebuild = rebuild;
	}


	public Protection(boolean delete) {
		super();
		this.delete = delete;
	}


	public Protection(boolean delete, boolean rebuild) {
		super();
		this.delete = delete;
		this.rebuild = rebuild;
	}


	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	
}
