package com.crm.Model;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerBean 
{
	@NotEmpty
	@Size(min=4,max=10)
private String FirstName;
	@NotEmpty
	@Size
private String LastName;
	@Email
private String Email;
	@NotEmpty
	@Size(min=8)
	@Pattern(regexp="^[a-z][a-z0-9#$!@]*")
private String password;
	@NotNull
private Gender gender;
	@NotEmpty
private String country;
	
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	this.Email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Map<String, String> getMap() {
	return countries;
}
public void setMap(Map<String, String> map) {
	this.countries=countries;
}
private Map<String,String> countries=new HashMap<String,String>();

public CustomerBean()
{
	countries.put("India","India");
	countries.put("Srilanka","Shrilanka");
	countries.put("Japan","Japan");
	countries.put("Australia","Australia");
	countries.put("USA","USA");
}

}
