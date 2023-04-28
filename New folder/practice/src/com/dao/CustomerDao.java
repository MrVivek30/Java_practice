package com.dao;

import java.util.List;

import com.Exception.RoomException;
import com.dto.Customer;

public interface CustomerDao {
	 public String addCustomerToRoom(Customer customer, int roomNumber)throws RoomException;
	 public String removeCustomerFromRoom(int customerId, int roomNumber)throws   RoomException;
	  public List<Customer> getCustomerFromParticularRoom(int roomNumber) throws      RoomException;
}
