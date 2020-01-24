package com.hetzner.demo.model;

import java.util.List;

public class VolumeResponse {
	private Volume volume;
	private Action action;
	private List<NextActions> next_actions;
	public VolumeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VolumeResponse(Volume volume, Action action, List<NextActions> next_actions) {
		super();
		this.volume = volume;
		this.action = action;
		this.next_actions = next_actions;
	}
	public Volume getVolume() {
		return volume;
	}
	public void setVolume(Volume volume) {
		this.volume = volume;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public List<NextActions> getNext_actions() {
		return next_actions;
	}
	public void setNext_actions(List<NextActions> next_actions) {
		this.next_actions = next_actions;
	}
	
	
}
