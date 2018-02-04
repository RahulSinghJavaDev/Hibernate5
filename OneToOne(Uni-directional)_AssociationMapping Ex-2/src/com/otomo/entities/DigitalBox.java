package com.otomo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DIGITAL_BOX")
public class DigitalBox {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="SERIAL_NO")
	protected int SerialNo;
	protected String model;
	protected String manufacturer;
	protected String type;
	protected int warranty;
	@ManyToOne
	@JoinColumn(name="DIGI_CARD_NO",unique=true)
	protected DigitalCard digitalCard;

	public int getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public DigitalCard getDigitalCard() {
		return digitalCard;
	}

	public void setDigitalCard(DigitalCard digitalCard) {
		this.digitalCard = digitalCard;
	}

}
