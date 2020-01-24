package com.hetzner.demo.model;

public class Prices {
	private String location;
	private PriceHourly price_hourly;
	private PriceMonthly price_monthly;
	public Prices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prices(String location, PriceHourly price_hourly, PriceMonthly price_monthly) {
		super();
		this.location = location;
		this.price_hourly = price_hourly;
		this.price_monthly = price_monthly;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public PriceHourly getPrice_hourly() {
		return price_hourly;
	}
	public void setPrice_hourly(PriceHourly price_hourly) {
		this.price_hourly = price_hourly;
	}
	public PriceMonthly getPrice_monthly() {
		return price_monthly;
	}
	public void setPrice_monthly(PriceMonthly price_monthly) {
		this.price_monthly = price_monthly;
	}
	
	
}
