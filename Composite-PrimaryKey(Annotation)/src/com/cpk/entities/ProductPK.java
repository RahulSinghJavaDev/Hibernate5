package com.cpk.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ProductPK implements Serializable {
	@Column(name="PRODUCT_ID")
	private String productId;
	@Column(name="BATCH_CODE")
	private int batchCode;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	
	@Override
	public String toString() {
		return "ProductPK [productId=" + productId + ", batchCode=" + batchCode + "]";
	}

}