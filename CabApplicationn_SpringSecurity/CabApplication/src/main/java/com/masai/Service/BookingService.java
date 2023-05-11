package com.masai.Service;

import com.masai.Entities.Booking;
import com.masai.Exception.UserException;

public interface BookingService {
	public Booking createBooking(int userID, int driverID, int x, int y) throws UserException;
}
