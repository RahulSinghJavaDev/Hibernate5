package com.hblc.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="TRAVEL_AGENCY")
public class TravelAgency {
	@Id
	@GenericGenerator(name="TAgen" , strategy="increment")
	@GeneratedValue(generator="TAgen")
	@Column(name="TOUR_PLAN_ID")
	private int tourplanId;
	@Column(name="PLAN_NM")
	private String planName;
	@Column(name="MEMBER_NM")
	private String memberName;
	@Column(name="PRICE")
	private float price;
	@Column (name="BOOKING_ID")
	private int bookingId;

	public int getTourplanId() {
		return tourplanId;
	}

	public void setTourplanId(int tourplanId) {
		this.tourplanId = tourplanId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "TravelAgency [tourplanId=" + tourplanId + ", planName=" + planName + ", memberName=" + memberName
				+ ", price=" + price + ", bookingId=" + bookingId + "]";
	}

}
