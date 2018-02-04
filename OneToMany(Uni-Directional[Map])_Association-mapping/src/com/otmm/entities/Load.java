package com.otmm.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="LOAD")
public class Load {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="LOAD_NO")
	protected int loadNo;
	@Basic
	protected String owner;
	@Column(name="DESCR")
	protected String description;
	@Basic
	protected int weight;
	@Column(name="SHIPPING_DT")
	protected Date shippingDate;

	public int getLoadNo() {
		return loadNo;
	}

	public void setLoadNo(int loadNo) {
		this.loadNo = loadNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Date getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}

}
