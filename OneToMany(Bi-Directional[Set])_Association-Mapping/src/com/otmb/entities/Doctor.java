package com.otmb.entities;

import java.util.Set;

public class Doctor {
	protected int doctorNo;
	protected String doctorName;
	protected int experience;
	protected String specialization;
	protected Set<Appointment> appointments;

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

	public int getDoctorNo() {
		return doctorNo;
	}

	public void setDoctorNo(int doctorNo) {
		this.doctorNo = doctorNo;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
