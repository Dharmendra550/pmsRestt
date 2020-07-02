package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course
{
@Id
private Integer courseid;
@Column(length=20)
private String coursename;

private Double fees;

public Course()
{


}

public Course(Integer courseid, String coursename, Double fees) {
	super();
	this.courseid = courseid;
	this.coursename = coursename;
	this.fees = fees;
}

public Integer getCourseid() {
	return courseid;
}

public void setCourseid(Integer courseid) {
	this.courseid = courseid;
}

public String getCoursename() {
	return coursename;
}

public void setCoursename(String coursename) {
	this.coursename = coursename;
}

public Double getFees() {
	return fees;
}

public void setFees(Double fees) {
	this.fees = fees;
}

@Override
public String toString() {
	return "Course [courseid=" + courseid + ", coursename=" + coursename + ", fees=" + fees + "]";
}

}
