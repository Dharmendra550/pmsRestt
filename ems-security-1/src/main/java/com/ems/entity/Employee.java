package com.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP1")
public class Employee 
{
@Id
@Column(name="emp_no")
private Integer empno;
@Column(name="emp_name")
private String empname;
@Column(name="emp_sal")
private Double sal;
@Column(name="emp_deptno")
private Integer deptno;
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public Integer getDeptno() {
	return deptno;
}
public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}

}
