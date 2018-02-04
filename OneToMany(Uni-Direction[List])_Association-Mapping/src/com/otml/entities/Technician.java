package com.otml.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="TECHNICIAL")
public class Technician {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="TECHNICIAN_NO")
	protected int technicianNo;
	@Column(name="TECHNICIAN_NM")
	protected String technicianName;
	@Column(name="CONTACT_NO")
	protected String contactNo;
	@Column(name="EMAIL_ADDRS")
	protected String emailAddress;
	protected String experience;
	protected String designation;
	@OneToMany
	@JoinColumn(name="REQ_TECHNICIAN_NO")
	@OrderColumn(name="REQ-QUEUE")
	protected List<ServiceRequest> serviceRequests;
	
	public List<ServiceRequest> getServiceRequests() {
		return serviceRequests;
	}

	public void setServiceRequests(List<ServiceRequest> serviceRequests) {
		this.serviceRequests = serviceRequests;
	}

	public int getTechnicianNo() {
		return technicianNo;
	}

	public void setTechnicianNo(int technicianNo) {
		this.technicianNo = technicianNo;
	}

	public String getTechnicianName() {
		return technicianName;
	}

	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
