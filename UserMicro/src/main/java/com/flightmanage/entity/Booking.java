package com.flightmanage.entity;

import java.util.ArrayList;
import java.util.List;

public class Booking {

	// data members
	private Long bookingid;
	private String bookingdate;
	private double ticketcost;
	private int noofpassenger;
	private Long userid; // referential key for user service and booking service

	List<Passenger> passlist = new ArrayList<>();

	// getter and setters
	public Long getBookingid() {
		return bookingid;
	}

	public void setBookingid(Long bookingid) {
		this.bookingid = bookingid;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public double getTicketcost() {
		return ticketcost;
	}

	public void setTicketcost(double ticketcost) {
		this.ticketcost = ticketcost;
	}

	public int getNoofpassenger() {
		return noofpassenger;
	}

	public void setNoofpassenger(int noofpassenger) {
		this.noofpassenger = noofpassenger;
	}

	public List<Passenger> getPasslist() {
		return passlist;
	}

	public void setPasslist(List<Passenger> passlist) {
		this.passlist = passlist;
	}

	// parameterized constructor
	public Booking(Long bookingid, String bookingdate, double ticketcost, int noofpassenger, Long userid,
			List<Passenger> passlist) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.ticketcost = ticketcost;
		this.noofpassenger = noofpassenger;
		this.userid = userid;
		this.passlist = passlist;
	}

	// paramaterized constructor
	public Booking(Long bookingid, String bookingdate, double ticketcost, int noofpassenger, Long userid) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.ticketcost = ticketcost;
		this.noofpassenger = noofpassenger;
		this.userid = userid;
	}

	// default constructor
	public Booking() {
		super();
	}

}