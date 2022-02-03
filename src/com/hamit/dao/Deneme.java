package com.hamit.dao;

public class Deneme {

	private String ram;
	private String cpu;

	public Deneme() {
		// TODO Auto-generated constructor stub
	}

	public Deneme(String ram, String cpu) {
		super();
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Deneme [ram=" + ram + ", cpu=" + cpu + "]";
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
