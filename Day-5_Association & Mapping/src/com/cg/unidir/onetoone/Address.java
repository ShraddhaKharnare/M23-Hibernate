package com.cg.unidir.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address 
{
@Id
@Column(name="Streetno")
private int Streetno;

@Column(name="Area")
private String area;

@Column(name="CIty")
private String city;

@Column(name="State")
private String state;


public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int streetno, String area, String city, String state) {
	super();
	Streetno = streetno;
	this.area = area;
	this.city = city;
	this.state = state;
}
//Getters and setters method
public int getStreetno() {
	return Streetno;
}
public void setStreetno(int streetno) {
	Streetno = streetno;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [Streetno=" + Streetno + ", area=" + area + ", city=" + city + ", state=" + state + "]";
}
}
