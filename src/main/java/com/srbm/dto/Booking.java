package com.srbm.dto ;

import java.util.Date;

public class Booking {

	 private String bookingId;
	    private Date startDate;
	    private Date endDate;

	    public Booking(String bookingId, Date startDate, Date endDate) {
	        this.bookingId = bookingId;
	        this.startDate = startDate;
	        this.endDate = endDate;
	    }

	    public String getBookingId() { 
	    	return bookingId; 
	    }
	    public Date getStartDate() { 
	    	return startDate; 
	    }
	    public Date getEndDate() { 
	    	return endDate; 
	    }

	    public void setStartDate(Date startDate) { 
	    	this.startDate = startDate; 
	    }
	    public void setEndDate(Date endDate) { 
	    	this.endDate = endDate; 
	    }
	    
}
