package com.otml.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="SERVICE_REQUEST")
public class ServiceRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="SERVICE_REQ_NO")
	protected int serviceRequestNo;
	@Column(name="CUSTOMER_NM")
	protected String customerName;
	@Column(name="PROBLEM_DESCR")
	protected String problemDescription;
	@Column(name="REQ_DT")
	protected String requestDate;
	@Column(name="ESTIMATED_DATE")
	protected int eta;
	@Column(name="USER_STATUS")
	protected String status;

	public int getServiceRequestNo() {
		return serviceRequestNo;
	}

	public void setServiceRequestNo(int serviceRequestNo) {
		this.serviceRequestNo = serviceRequestNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
