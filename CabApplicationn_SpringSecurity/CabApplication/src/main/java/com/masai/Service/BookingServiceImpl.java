package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entities.Booking;
import com.masai.Entities.User;
import com.masai.Exception.UserException;
import com.masai.Repository.BookingRepository;
import com.masai.Repository.UserRepository;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingRepository bookingRep;
	
	@Autowired
	private UserRepository userRep;

	@Override
	public Booking createBooking(int userID, int driverID, int x, int y) throws UserException{
		User u = userRep.findById(userID).orElseThrow(() -> new UserException("Invalid UserID"));
		User d = userRep.findById(driverID).orElseThrow(() -> new UserException("Invalid DriverID"));
		Booking b = new Booking();
		b.setUser(u);
		b.setDriver(d);
		b.setDestination_x(x);
		b.setDestination_y(y);
		b.setInitial_x(u.getX_coordinate());
		b.setInitial_y(u.getY_coordinate());
		Booking boo = bookingRep.save(b);
		u.getBookings().add(boo);
		d.getBookings().add(boo);
		return boo;
	}

}
