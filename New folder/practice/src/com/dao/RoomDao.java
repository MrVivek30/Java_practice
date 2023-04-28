package com.dao;

import java.util.List;

import com.Exception.RoomException;
import com.dto.Room;

public interface RoomDao {
	 public String addRoom(Room room) throws RoomException;
	 public Room getRoomByRoomType(String name)throws RoomException;
	  public List<Room> getEmptyRoom()throws RoomException;
	  public List<Room> getAllRoomDetails(); 

}
