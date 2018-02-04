package com.oto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="NETWORK_PREFRENCES")
public class NetworkPrefrences {
	@Id()
	@GenericGenerator(name="nt_gen", strategy="foreign",parameters={@Parameter(name="property", value="subscriber")})
	@GeneratedValue(generator="nt_gen")
	protected String subscriberId;
	@Column(name="CALL_WAITING")
	protected boolean callWaiting;
	@Column(name="CALL_FORWARDING")
	protected boolean callForwarding;
	@Column(name="INTERNET")
	protected boolean internet;
	@Column(name="VOICE_MAILBOX")
	protected boolean voiceMailbox;
	@Column(name="MISSEDCALL_ALERT")
	protected boolean missedCallAlert;
	@OneToOne
	@PrimaryKeyJoinColumn(name="subscriberId")
	protected Subscriber subscriber;
	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	public boolean getCallWaiting() {
		return callWaiting;
	}
	public void setCallWaiting(boolean callWaiting) {
		this.callWaiting = callWaiting;
	}
	public boolean getCallForwarding() {
		return callForwarding;
	}
	public void setCallForwarding(boolean callForwarding) {
		this.callForwarding = callForwarding;
	}
	public boolean getInternet() {
		return internet;
	}
	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	public boolean getVoiceMailbox() {
		return voiceMailbox;
	}
	public void setVoiceMailbox(boolean voiceMailbox) {
		this.voiceMailbox = voiceMailbox;
	}
	public boolean getMissedCallAlert() {
		return missedCallAlert;
	}
	public void setMissedCallAlert(boolean missedCallAlert) {
		this.missedCallAlert = missedCallAlert;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

}