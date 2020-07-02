package com.pack.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Student
{
@Id
private Integer studentid;
@Column(length=20)
private String studentname;
	
private Long mobile;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JoinColumn(name="studentid_fk")
private Set<Course>courses;
public Student()
{
	
}

public Student(Integer studentid, String studentname, Long mobile) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.mobile = mobile;
}



public Integer getStudentid() {
	return studentid;
}

public void setStudentid(Integer studentid) {
	this.studentid = studentid;
}

public String getStudentname() {
	return studentname;
}

public void setStudentname(String studentname) {
	this.studentname = studentname;
}

public Long getMobile() {
	return mobile;
}

public void setMobile(Long mobile) {
	this.mobile = mobile;
}

public Set<Course> getCourses() {
	return courses;
}

public void setCourses(Set<Course> courses) {
	this.courses = courses;
}

@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", mobile=" + mobile + ", courses="
			+ courses + "]";
}

}
