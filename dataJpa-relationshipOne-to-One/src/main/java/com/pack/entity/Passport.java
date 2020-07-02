package com.pack.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;


@Entity
public class Passport 
{
@Id
private Integer passportId;
@Temporal(TemporalType.DATE)
private Date passportexpireDate;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="person_id_fk",unique=true,nullable=false)
private Person person;

public Integer getPassportid() {
	return passportId;
}

public void setPassportid(Integer passportid) {
	this.passportId = passportid;
}

public Date getPassportexpiredate() {
	return passportexpireDate;
}

public void setPassportexpiredate(Date passportexpiredate) {
	this.passportexpireDate = passportexpiredate;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

@Override
public String toString() {
	return "Passport [passportid=" + passportId + ", passportexpiredate=" + passportexpireDate + ", person=" + person
			+ "]";
}


}

