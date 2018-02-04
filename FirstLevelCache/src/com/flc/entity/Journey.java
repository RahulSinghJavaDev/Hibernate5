package com.flc.entity;

import java.util.Date;

public class Journey {
	private int journeyNo;
	private String source;
	private String destination;
	private String passangers;
	private Date journeyDate;
	
	public int getJourneyNo() {
		return journeyNo;
	}
	public void setJourneyNo(int journeyNo) {
		this.journeyNo = journeyNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPassangers() {
		return passangers;
	}
	public void setPassangers(String passangers) {
		this.passangers = passangers;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "Journey [journeyNo=" + journeyNo + ", source=" + source + ", destination=" + destination
				+ ", passangers=" + passangers + ", journeyDate=" + journeyDate + "]";
	}
	
}
