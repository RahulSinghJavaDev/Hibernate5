package com.otomo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ADMISSION")
public class Admission {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ADMISSION_NO")
	protected int admissionNo;
	@Column(name="STUDENT_NM")
	protected String studentName;
	protected String standard;
	@Column(name="ACADMIC_YEAR")
	protected int acadmicYear;
	@Column(name="ADMISSION_DATE")
	protected Date admissionDate;
	@Column(name="ADMISSION_FEE")
	protected float admissionFee;

	public int getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getAcadmicYear() {
		return acadmicYear;
	}

	public void setAcadmicYear(int acadmicYear) {
		this.acadmicYear = acadmicYear;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public float getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(float admissionFee) {
		this.admissionFee = admissionFee;
	}

}
