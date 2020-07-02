package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="PASSENGER")
@NamedQueries({
@NamedQuery(name="Passenger.byFirstName",
            query="select passenger from Passenger passenger where passenger.firstName like '%I%' "),

@NamedQuery(name="Passenger.byFirstName",
query="select passenger from Passenger passenger where passenger.firstName like '%A%' ")


             })
public class Passenger 
{
@Id
Integer passengerId;

@Column(length=20)
String firstName;

@Column(length=20)
String lastName;

Integer age;

@Column(length=10)
String gender;

Integer SeatNumber;

public Integer getPassengerId() {
	return passengerId;
}
public void setPassengerId(Integer passengerId) {
	this.passengerId = passengerId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getSeatNumber() {
	return SeatNumber;
}
public void setSeatNumber(Integer seatNumber) {
	SeatNumber = seatNumber;
}
@Override
public String toString() {
	return "Passenger [passengerId=" + passengerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
			+ age + ", gender=" + gender + ", SeatNumber=" + SeatNumber + ", getPassengerId()=" + getPassengerId()
			+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAge()=" + getAge()
			+ ", getGender()=" + getGender() + ", getSeatNumber()=" + getSeatNumber() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
