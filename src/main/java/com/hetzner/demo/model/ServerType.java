package com.hetzner.demo.model;

public class ServerType {
	private String id;
	private String name;
	private String description;
	private int cores;
	private int memory;
	private int disk;
	private boolean deprecated;
	private Prices prices;
	private String storage_type;
	private String cpu_type;
	public ServerType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServerType(String id, String name, String description, int cores, int memory, int disk, boolean deprecated,
			Prices prices, String storage_type, String cpu_type) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.cores = cores;
		this.memory = memory;
		this.disk = disk;
		this.deprecated = deprecated;
		this.prices = prices;
		this.storage_type = storage_type;
		this.cpu_type = cpu_type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getDisk() {
		return disk;
	}
	public void setDisk(int disk) {
		this.disk = disk;
	}
	public boolean isDeprecated() {
		return deprecated;
	}
	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}
	public Prices getPrices() {
		return prices;
	}
	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	public String getStorage_type() {
		return storage_type;
	}
	public void setStorage_type(String storage_type) {
		this.storage_type = storage_type;
	}
	public String getCpu_type() {
		return cpu_type;
	}
	public void setCpu_type(String cpu_type) {
		this.cpu_type = cpu_type;
	}
	
	
}
