package com.customer.dto;

import java.util.List;

public class CustomerDto
{
	private Long phoneNumber;
	private String username;
	private String email;
	private String planId;
	private PlanDto currentplan;
	private List<Long>friendsContactNumbers;
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public  String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public PlanDto getCurrentplan() {
		return currentplan;
	}
	public void setCurrentplan(PlanDto currentplan) {
		this.currentplan = currentplan;
	}
	public List<Long> getFriendsContactNumbers() {
		return friendsContactNumbers;
	}
	public void setFriendsContactNumbers(List<Long> friendsContactNumbers) {
		this.friendsContactNumbers = friendsContactNumbers;
	}
	
}
