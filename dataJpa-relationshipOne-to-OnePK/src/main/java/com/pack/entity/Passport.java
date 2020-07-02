package com.pack.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Passport 
{
	@GenericGenerator(name="f1",strategy="foreign",parameters=@Parameter(name="property",value="person"))
	@Id
	@GeneratedValue(generator="f1")
	private Integer passportId;
	@Temporal(TemporalType.DATE)
	private Date passportexpireDate;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
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


