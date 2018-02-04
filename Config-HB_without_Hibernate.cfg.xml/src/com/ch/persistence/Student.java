package com.ch.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="STUDENT")
public class Student {
	@Id
	@Column (name="SERIAL_NO")
	private int serialNo;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column (name="class")
	private String clazz;
	@Column (name="ROLL_NO")
	private int rollNo;
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
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
	
	@Override
	public String toString() {
		return "Student [serialNo=" + serialNo + ", firstName=" + firstName + ", lastName=" + lastName + ", clazz="
				+ clazz + ", rollNo=" + rollNo + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
