package com.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel 
{
@Id
private Integer hotelid;

private Integer roomno;

private Double cost;

private String location;

private Integer rating;

public Integer getHotelid() {
	return hotelid;
}

public void setHotelid(Integer hotelid) {
	this.hotelid = hotelid;
}

public Integer getRoomno() {
	return roomno;
}

public void setRoomno(Integer roomno) {
	this.roomno = roomno;
}

public Double getCost() {
	return cost;
}

public void setCost(Double cost) {
	this.cost = cost;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public Integer getRating() {
	return rating;
}

public void setRating(Integer rating) {
	this.rating = rating;
}

}
