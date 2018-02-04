package com.cpk.entities;

import java.io.Serializable;

public class ProductPK implements Serializable {
	private String productId;
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
}
