package com.oto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="SUBSCRIBER")
public class Subscriber {
	
	@GeneratedValue(generator="sub_gen_uuid")
	@GenericGenerator(name="sub_gen_uuid", strategy = "uuid")
	@Column(name="SUBSCRIBER_ID")
	@Id
	protected String subscriberId;
	@Column(name="MEMBER_NM")
	protected String memberName;
	@Column(name="MOB_NO")
	protected String mobileNo;
	@Column(name="CONN_TYPE")
	protected String connectionType;
	@Column(name="SIM_TYPE")
	protected String simType;

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getSimType() {
		return simType;
	}

	public void setSimType(String simType) {
		this.simType = simType;
	}

}