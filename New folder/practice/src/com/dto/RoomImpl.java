package com.dto;

public class RoomImpl implements Room{

	private int roomnumber;
	private String roomtype;
	private double pricepernight;
	private int maximumperson;
	private boolean empty;
	
	public RoomImpl() {
		
	}
	public RoomImpl(int roomnumber, String roomtype, double pricepernight, int maximumperson, boolean empty) {
		super();
		this.roomnumber = roomnumber;
		this.roomtype = roomtype;
		this.pricepernight = pricepernight;
		this.maximumperson = maximumperson;
		this.empty = empty;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public double getPricepernight() {
		return pricepernight;
	}
	public void setPricepernight(double pricepernight) {
		this.pricepernight = pricepernight;
	}
	public int getMaximumperson() {
		return maximumperson;
	}
	public void setMaximumperson(int maximumperson) {
		this.maximumperson = maximumperson;
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	@Override
	public String toString() {
		return "RoomImpl [roomnumber=" + roomnumber + ", roomtype=" + roomtype + ", pricepernight=" + pricepernight
				+ ", maximumperson=" + maximumperson + ", empty=" + empty + "]";
	}
	
	
	
}
