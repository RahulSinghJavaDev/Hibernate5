package com.cpk.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {
	@EmbeddedId
	private ProductPK id;
	@Column(name="PRODUCTNAME")
	private String productName;
	@Column(name="MANUFACTURER")
	private String manufacturer;
	@Column(name="MANUFACTUREDDATE")
	private Date manufacturedDate;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="PRICE")
	private float price;

	public ProductPK getId() {
		return id;
	}

	public void setId(ProductPK id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", manufacturer=" + manufacturer
				+ ", manufacturedDate=" + manufacturedDate + ", description=" + description + ", price=" + price + "]";
	}

}