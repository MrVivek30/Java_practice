package com.dto;

public interface Room {
		
	public int getRoomnumber() ;
	public void setRoomnumber(int roomnumber) ;
	public String getRoomtype();
	public void setRoomtype(String roomtype) ;
	public double getPricepernight();
	public void setPricepernight(double pricepernight) ;
	public int getMaximumperson() ;
	public void setMaximumperson(int maximumperson) ;
	public boolean isEmpty() ;
	public void setEmpty(boolean empty) ;
}
