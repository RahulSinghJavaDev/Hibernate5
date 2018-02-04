package com.dml.entities;

import java.io.Serializable;
import java.util.Date;

public class InsurancePolicy implements Serializable{
	private int policyNo;
	private String policyholderName;
	private String ploicyName;
	private Date effectiveDate;
	private int tenure;
	private float premiumAmount;
	
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyholderName() {
		return policyholderName;
	}
	public void setPolicyholderName(String policyholderName) {
		this.policyholderName = policyholderName;
	}
	public String getPloicyName() {
		return ploicyName;
	}
	public void setPloicyName(String ploicyName) {
		this.ploicyName = ploicyName;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(float premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}