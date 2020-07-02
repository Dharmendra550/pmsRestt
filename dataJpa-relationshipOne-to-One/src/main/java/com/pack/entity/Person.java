package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person
{
@Id
private Integer personId;
@Column(length=20)
private String personName;
public Integer getPersonid() {
	return personId;
}
public void setPersonid(Integer personid) {
	this.personId = personid;
}
public String getPersonname() {
	return personName;
}
public void setPersonname(String personname) {
	this.personName = personname;
}
@Override
public String toString() {
	return "Person [personid=" + personId + ", personname=" + personName + "]";
}

}

