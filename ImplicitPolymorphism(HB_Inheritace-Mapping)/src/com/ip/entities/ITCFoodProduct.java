package com.ip.entities;

import java.util.Date;

public class ITCFoodProduct extends ITCProduct {
	protected int productId;
	protected String productName;
	protected float price;
	protected Date manufacturedDate;
	protected int weight;
	protected Date expirationDate;
	protected String description;
	protected String productionFactory;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductionFactory() {
		return productionFactory;
	}

	public void setProductionFactory(String productionFactory) {
		this.productionFactory = productionFactory;
	}

}
