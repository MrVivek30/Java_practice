package com.dto;

public class Cab {

	private int cabNo;
	private String cabColor;
	private String modelName;

	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cab(int cabNo, String cabColor, String modelName) {
		super();
		this.cabNo = cabNo;
		this.cabColor = cabColor;
		this.modelName = modelName;
	}

	public int getCabNo() {
		return cabNo;
	}

	public void setCabNo(int cabNo) {
		this.cabNo = cabNo;
	}

	public String getCabColor() {
		return cabColor;
	}

	public void setCabColor(String cabColor) {
		this.cabColor = cabColor;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Cab [cabNo=" + cabNo + ", cabColor=" + cabColor + ", modelName=" + modelName + "]";
	}

}
