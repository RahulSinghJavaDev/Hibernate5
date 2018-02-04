package com.otmm.entities;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="CARGO")
public class Cargo {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="CARGO_NO")
	protected int cargoNo;
	@Column(name="CARGO_NM")
	protected String cargoName;
	@Column(name="CARGO_TYPE")
	protected String type;
	@Column(name="capacity")
	protected int capacity;
	@Column(name="CARGO_COUNTRY")
	protected String cargoCountry;
	@OneToMany
	@JoinColumn(name="SHIPMENT_NO")
	@MapKeyColumn(name="CARGO_SEQ")
	protected Map<String,Load>loads;

	public Map<String, Load> getLoads() {
		return loads;
	}

	public void setLoads(Map<String, Load> loads) {
		this.loads = loads;
	}

	public int getCargoNo() {
		return cargoNo;
	}

	public void setCargoNo(int cargoNo) {
		this.cargoNo = cargoNo;
	}

	public String getCargoName() {
		return cargoName;
	}

	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCargoCountry() {
		return cargoCountry;
	}

	public void setCargoCountry(String cargoCountry) {
		this.cargoCountry = cargoCountry;
	}
}
