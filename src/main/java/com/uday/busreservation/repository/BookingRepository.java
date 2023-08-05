package com.uday.busreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.busreservation.domain.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
