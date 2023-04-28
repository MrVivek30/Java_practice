package com.dto;

public class CustomerImpl implements Customer{

	private int customerid;
	private String customername;
	private String address;
	private int roomnumber;
	
	public CustomerImpl() {
		
	}
	
	public CustomerImpl(int customerid, String customername, String address, int roomnumber) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.address = address;
		this.roomnumber = roomnumber;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	@Override
	public String toString() {
		return "CustomerImpl [customerid=" + customerid + ", customername=" + customername + ", address=" + address
				+ ", roomnumber=" + roomnumber + "]";
	}
	
	
	
}
