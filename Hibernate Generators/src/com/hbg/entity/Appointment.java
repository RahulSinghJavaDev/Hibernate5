package com.hbg.entity;

import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable {
	protected int appointmentNo;
	//protected String appointmentNo;
	protected String Doctor;
	protected String patient;
	protected Date appDate;
	protected String status;
	public int getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}
	
	public String getDoctor() {
		return Doctor;
	}
	/*public String getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(String appointmentNo) {
		this.appointmentNo = appointmentNo;
	}*/
	public void setDoctor(String doctor) {
		Doctor = doctor;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Appointment [appointmentNo=" + appointmentNo + ", Doctor=" + Doctor + ", patient=" + patient
				+ ", appDate=" + appDate + ", status=" + status + "]";
	}
	
	
}
