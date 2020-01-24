package com.hetzner.demo.model;

import java.util.Date;

public class Image {
	private String id;
	private String type;
	private String status;
	private String name;
	private String description;
	private float image_size;
	private int disk_size;
	private Date created= new Date();
	private CreatedFrom created_from;
	private String bound_to;
	private String os_flavor;
	private String os_version;
	private boolean rapid_deploy;
	private Protection protection;
	
	private Date deprecated= new Date();
	private Labels labels;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String id, String type, String status, String name, String description, float image_size,
			int disk_size, Date created, CreatedFrom created_from, String bound_to, String os_flavor, String os_version,
			boolean rapid_deploy, Protection protection, Date deprecated, Labels labels) {
		super();
		this.id = id;
		this.type = type;
		this.status = status;
		this.name = name;
		this.description = description;
		this.image_size = image_size;
		this.disk_size = disk_size;
		this.created = created;
		this.created_from = created_from;
		this.bound_to = bound_to;
		this.os_flavor = os_flavor;
		this.os_version = os_version;
		this.rapid_deploy = rapid_deploy;
		this.protection = protection;
		this.deprecated = deprecated;
		this.labels = labels;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getImage_size() {
		return image_size;
	}
	public void setImage_size(float image_size) {
		this.image_size = image_size;
	}
	public int getDisk_size() {
		return disk_size;
	}
	public void setDisk_size(int disk_size) {
		this.disk_size = disk_size;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public CreatedFrom getCreated_from() {
		return created_from;
	}
	public void setCreated_from(CreatedFrom created_from) {
		this.created_from = created_from;
	}
	public String getBound_to() {
		return bound_to;
	}
	public void setBound_to(String bound_to) {
		this.bound_to = bound_to;
	}
	public String getOs_flavor() {
		return os_flavor;
	}
	public void setOs_flavor(String os_flavor) {
		this.os_flavor = os_flavor;
	}
	public String getOs_version() {
		return os_version;
	}
	public void setOs_version(String os_version) {
		this.os_version = os_version;
	}
	public boolean isRapid_deploy() {
		return rapid_deploy;
	}
	public void setRapid_deploy(boolean rapid_deploy) {
		this.rapid_deploy = rapid_deploy;
	}
	public Protection getProtection() {
		return protection;
	}
	public void setProtection(Protection protection) {
		this.protection = protection;
	}
	public Date getDeprecated() {
		return deprecated;
	}
	public void setDeprecated(Date deprecated) {
		this.deprecated = deprecated;
	}
	public Labels getLabels() {
		return labels;
	}
	public void setLabels(Labels labels) {
		this.labels = labels;
	}
	
	
}
