package com.generators.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.metamodel.relational.Schema.Name;

@Entity
@Table(name="PRODUCTS")
public class Products implements Serializable {
	
	@Id
	@GeneratedValue (strategy= GenerationType.SEQUENCE, generator="productSeqGen")
	@SequenceGenerator(name = "productSeqGen", sequenceName = "PRODUCT_SEQ_GEN")
	@Column(name="PRODUCT_ID" )
	private int productId;
	@Column(name="PRODUCT_NM")
	private String productName;
	@Column(name="DESC")
	private String description;
	private float price;
	private int availablity;
	
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
	public int getAvailablity() {
		return availablity;
	}
	public void setAvailablity(int availablity) {
		this.availablity = availablity;
	}
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", availablity=" + availablity + "]";
	}
	
}
