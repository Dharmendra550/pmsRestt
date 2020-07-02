package com.pms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product
{
	@Id
private Integer productid;
private String productname;
private Double price;
private String manufacturer;
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
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}

}
