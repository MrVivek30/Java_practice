package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
