package com.cpk.entities;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
	private ProductPK id;
	private String productName;
	private String manufacturer;
	private Date manufacturedDate;
	private String description;
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

}