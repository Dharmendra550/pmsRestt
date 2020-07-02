package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product
{
	@Id
private Integer productid;
private String productname;
private Double price;
private Double Discount;
public Integer getProductid() {
	return productid;
}
public void setProductid(Integer productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Double getDiscount() {
	return Discount;
}
public void setDiscount(Double discount) {
	Discount = discount;
}

}
