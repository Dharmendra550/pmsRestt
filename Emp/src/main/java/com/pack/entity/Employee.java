package com.pack.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Employee
{
	@Id
private Integer empid;
private String empname;
private Double price;
private Long mobileno;
public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Long getMobileno() {
	return mobileno;
}
public void setMobileno(Long mobileno) {
	this.mobileno = mobileno;
}

}
