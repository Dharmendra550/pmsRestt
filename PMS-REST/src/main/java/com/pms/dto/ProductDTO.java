package com.pms.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
@XmlAccessorType(XmlAccessType.NONE)
public class ProductDTO implements java.io.Serializable
{
	@XmlElement
private Integer productid;
	@XmlElement
private String productname;
	@XmlElement
private Double price;
	@XmlElement
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
