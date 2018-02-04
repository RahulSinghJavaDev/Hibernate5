package com.otms.entities;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="RESTAURANT")
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="RESTAURANT_NO")
	protected int restaurantNo;
	@Column(name="RESTAURANT_NM")
	protected String restaurantName;
	@Basic
	protected String location;
	@Basic
	protected String contactNo;
	@Basic
	protected String type;
	@OneToMany
	@JoinColumn(name="RESTAURANT_REVIEW_NO")
	protected Set<Review> reviews;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRestaurantNo() {
		return restaurantNo;
	}

	public void setRestaurantNo(int restaurantNo) {
		this.restaurantNo = restaurantNo;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

}
