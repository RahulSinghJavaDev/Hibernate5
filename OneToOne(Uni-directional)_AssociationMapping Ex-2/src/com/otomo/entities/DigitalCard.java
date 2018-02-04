package com.otomo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DIGITALCARD")
public class DigitalCard {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="CARD_NO")
	protected int cardNo;
	protected String provider;
	@Column(name="SUSCRIBER_NAME")
	protected String suscriberName;
	@Column(name="PURCHASE_DATE")
	protected Date purchaseDate;

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getSuscriberName() {
		return suscriberName;
	}

	public void setSuscriberName(String suscriberName) {
		this.suscriberName = suscriberName;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
