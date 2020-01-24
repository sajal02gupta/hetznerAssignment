package com.hetzner.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerResponse {
	private Server server;
	private Image image;
	private Iso iso;
	private boolean rescue_enabled;
	private boolean locked;
	private String backup_window;
	private long outgoing_traffic;
	private long ingoing_traffic;
	private long included_traffic;
	private Protection protection;
	private Labels labels;
	private List<Integer> volumes;
	private Action action;
	private List<NextActions> next_actions;
	private String root_password;
	
	public ServerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ServerResponse(Server server, Image image, Iso iso, boolean rescue_enabled, boolean locked,
			String backup_window, long outgoing_traffic, long ingoing_traffic, long included_traffic,
			Protection protection, Labels labels, List<Integer> volumes, Action action, List<NextActions> next_actions,
			String root_password) {
		super();
		this.server = server;
		this.image = image;
		this.iso = iso;
		this.rescue_enabled = rescue_enabled;
		this.locked = locked;
		this.backup_window = backup_window;
		this.outgoing_traffic = outgoing_traffic;
		this.ingoing_traffic = ingoing_traffic;
		this.included_traffic = included_traffic;
		this.protection = protection;
		this.labels = labels;
		this.volumes = volumes;
		this.action = action;
		this.next_actions = next_actions;
		this.root_password = root_password;
	}
	public Server getServer() {
		return server;
	}
	public void setServer(Server server) {
		this.server = server;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public Iso getIso() {
		return iso;
	}
	public void setIso(Iso iso) {
		this.iso = iso;
	}
	public boolean isRescue_enabled() {
		return rescue_enabled;
	}
	public void setRescue_enabled(boolean rescue_enabled) {
		this.rescue_enabled = rescue_enabled;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public String getBackup_window() {
		return backup_window;
	}
	public void setBackup_window(String backup_window) {
		this.backup_window = backup_window;
	}
	public long getOutgoing_traffic() {
		return outgoing_traffic;
	}
	public void setOutgoing_traffic(long outgoing_traffic) {
		this.outgoing_traffic = outgoing_traffic;
	}
	public long getIngoing_traffic() {
		return ingoing_traffic;
	}
	public void setIngoing_traffic(long ingoing_traffic) {
		this.ingoing_traffic = ingoing_traffic;
	}
	public long getIncluded_traffic() {
		return included_traffic;
	}
	public void setIncluded_traffic(long included_traffic) {
		this.included_traffic = included_traffic;
	}
	public Protection getProtection() {
		return protection;
	}
	public void setProtection(Protection protection) {
		this.protection = protection;
	}
	public Labels getLabels() {
		return labels;
	}
	public void setLabels(Labels labels) {
		this.labels = labels;
	}
	public List<Integer> getVolumes() {
		return volumes;
	}
	public void setVolumes(List<Integer> volumes) {
		this.volumes = volumes;
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
	public String getRoot_password() {
		return root_password;
	}
	public void setRoot_password(String root_password) {
		this.root_password = root_password;
	}
	
	
}
