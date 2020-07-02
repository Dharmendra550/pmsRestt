package com.rest.entity;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rest.model.User;

@Entity
public class Trade 
{
	@Id
private Integer tradeid;
private String tradetype;
@Embedded
private User user;
private String symbol;
private Integer shares;
private Double price;
@Temporal(TemporalType.TIMESTAMP)
private Date  timestamp;
public Integer getTradeid() {
	return tradeid;
}
public void setTradeid(Integer tradeid) {
	this.tradeid = tradeid;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getTradetype() {
	return tradetype;
}
public void setTradetype(String tradetype) {
	this.tradetype = tradetype;
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public Integer getShares() {
	return shares;
}
public void setShares(Integer shares) {
	this.shares = shares;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}


}
