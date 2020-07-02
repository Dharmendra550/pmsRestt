package com.pack.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer 
{
	@Id
private Integer customerId;
	@Column(length=20)
private String customerName;
private Long Mobile;
@OneToMany(cascade=CascadeType.ALL,mappedBy="customer")
private Set<Order> orders;

public Set<Order> getOrders() {
	return orders;
}

public void setOrders(Set<Order> orders) {
	this.orders = orders;
}

public Customer() {
	
}

public Customer(Integer customerId, Long mobile, String customerName) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	Mobile = mobile;
}



public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Long getMobile() {
	return Mobile;
}
public void setMobile(Long mobile) {
	Mobile = mobile;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", Mobile=" + Mobile + "]";
}

}
