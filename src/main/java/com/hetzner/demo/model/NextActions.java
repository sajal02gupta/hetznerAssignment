package com.hetzner.demo.model;

import java.util.Date;

public class NextActions {
	private String id;
	private String command;
	private String status;
	private long progress;
	private Date started= new Date();
	private String finished;
	private Resources resources;
	private Error error;
	public NextActions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NextActions(String id, String command, String status, long progress, Date started, String finished,
			Resources resources, Error error) {
		super();
		this.id = id;
		this.command = command;
		this.status = status;
		this.progress = progress;
		this.started = started;
		this.finished = finished;
		this.resources = resources;
		this.error = error;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getProgress() {
		return progress;
	}
	public void setProgress(long progress) {
		this.progress = progress;
	}
	public Date getStarted() {
		return started;
	}
	public void setStarted(Date started) {
		this.started = started;
	}
	public String getFinished() {
		return finished;
	}
	public void setFinished(String finished) {
		this.finished = finished;
	}
	public Resources getResources() {
		return resources;
	}
	public void setResources(Resources resources) {
		this.resources = resources;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	
	
}
