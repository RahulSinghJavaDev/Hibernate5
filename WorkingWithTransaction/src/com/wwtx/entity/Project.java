package com.wwtx.entity;

public class Project {
	private int projectNo;
	private String title;
	private String description;
	private String domain;
	private int duration;
	private String client;
	private String status;
	//getter and setter
	
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//toString
	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", title=" + title + ", description=" + description + ", domain="
				+ domain + ", duration=" + duration + ", client=" + client + ", status=" + status + "]";
	}
	
	 
}
