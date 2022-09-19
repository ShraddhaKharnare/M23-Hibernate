package com.cg.entites;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="placement")
public class Placement 
{
	@Id
	private int placement_id;   
	private String name;
	private LocalDate date;
	private String qualification;    
	private int year;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="College_id")
	private College college;
	
	
	//Getters and Setters method
	public int getId() {
		return placement_id;
	}
	public void setId( int placement_id) {
		this.placement_id = placement_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
