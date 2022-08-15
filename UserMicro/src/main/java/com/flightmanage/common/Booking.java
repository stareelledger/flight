package com.flightmanage.common;

import java.util.ArrayList;
import java.util.List;

public class Booking {

	private Long bookingid;
	private String bookingdate;
	private double ticketcost;
	private int noofpassenger;
	private Long userid;
	private String bookingstatus;

	List<Passenger> passlist = new ArrayList<>();

	public Long getBookingid() {
		return bookingid;
	}

	public void setBookingid(Long bookingid) {
		this.bookingid = bookingid;
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

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getBookingstatus() {
		return bookingstatus;
	}

	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public List<Passenger> getPasslist() {
		return passlist;
	}

	public void setPasslist(List<Passenger> passlist) {
		this.passlist = passlist;
	}

	public Booking(Long bookingid, String bookingdate, double ticketcost, int noofpassenger, Long userid,
			String bookingstatus, List<Passenger> passlist) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.ticketcost = ticketcost;
		this.noofpassenger = noofpassenger;
		this.userid = userid;
		this.bookingstatus = bookingstatus;
		this.passlist = passlist;
	}

	public Booking(Long bookingid, String bookingdate, double ticketcost, int noofpassenger, Long userid,
			String bookingstatus) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.ticketcost = ticketcost;
		this.noofpassenger = noofpassenger;
		this.userid = userid;
		this.bookingstatus = bookingstatus;
	}

	public Booking() {
		super();
	}
}
