package com.flightmanage.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.flightmanage.entity.Booking;
import com.flightmanage.entity.Passenger;
import com.flightmanage.service.Bookingservicelayer;

@RestController // consumes web service APIs
@RequestMapping("/book")
public class Bookingcontrol {
	@Autowired
	private Bookingservicelayer bookservice;
	
	@Autowired
	public RestTemplate restTemplate;

	@RequestMapping("/{userid}")
	public Booking getUserdetails(@PathVariable("userid") Long userid) {
		
		List<Booking> booking= this.bookservice.getuserdetails(userid);
		List<Passenger> passenger=this.restTemplate.getForObject("http://localhost:4401/product/orderit/" + booking.get(0).getBookingid(), List.class);
		booking.get(0).setPasslist(passenger);
		return booking.get(0);
	}
	

}
