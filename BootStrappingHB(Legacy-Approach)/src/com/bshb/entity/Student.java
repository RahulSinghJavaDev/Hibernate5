package com.bshb.entity;

import java.util.Date;

public class Student {
	private int serialNo;
	private String firstName;
	private String lastName;
	private String clazz;
	private int rollNo;
	private Date dateOfBirth;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [serialNo=" + serialNo + ", firstName=" + firstName + ", lastName=" + lastName + ", clazz="
				+ clazz + ", rollNo=" + rollNo + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
