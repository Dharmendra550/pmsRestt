package com.pack.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customers")
public class Customer
{
@Id
private Integer customerId;
private String customerName;
private String city;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
}

}
