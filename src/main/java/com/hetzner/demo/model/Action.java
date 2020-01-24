package com.hetzner.demo.model;

import java.util.Date;
import java.util.List;

public class Action {
	private String id;
	private String command;
	private String running;
	private String progress;
	private Date started = new Date();
	private String finished;
	private List<Resources> resources;
	
	private Error error;

	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Action(String id, String command, String running, String progress, Date started, String finished,
			List<Resources> resources, Error error) {
		super();
		this.id = id;
		this.command = command;
		this.running = running;
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

	public String getRunning() {
		return running;
	}

	public void setRunning(String running) {
		this.running = running;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
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

	public List<Resources> getResources() {
		return resources;
	}

	public void setResources(List<Resources> resources) {
		this.resources = resources;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
	
}
