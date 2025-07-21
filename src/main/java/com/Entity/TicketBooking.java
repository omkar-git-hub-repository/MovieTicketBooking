package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TicketBooking {
	
	@Id
	private int id;
	private String MovieName;
	
	private String CustomerName;
	private String ShowTime;
	private int seatBooked;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getShowTime() {
		return ShowTime;
	}
	public void setShowTime(String showTime) {
		ShowTime = showTime;
	}
	public int getSeatBooked() {
		return seatBooked;
	}
	public void setSeatBooked(int seatBooked) {
		this.seatBooked = seatBooked;
	}
	@Override
	public String toString() {
		return "TicketBooking [id=" + id + ", MovieName=" + MovieName + ", CustomerName=" + CustomerName + ", ShowTime="
				+ ShowTime + ", seatBooked=" + seatBooked + "]";
	}
	
	
	
	
}
