package com.hetzner.demo.model;

public class PriceMonthly {
	private String net;
	private String gross;
	public PriceMonthly() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PriceMonthly(String net, String gross) {
		super();
		this.net = net;
		this.gross = gross;
	}
	public String getNet() {
		return net;
	}
	public void setNet(String net) {
		this.net = net;
	}
	public String getGross() {
		return gross;
	}
	public void setGross(String gross) {
		this.gross = gross;
	}
	
	
}
