package com.cg.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College 
{
	@Id
	@Column(name="college_id")
	private int college_id;
	private String CollegeName ;
	private String location ;
	
	@OneToMany(mappedBy="User")
	private User collegeAdmin ;

	
	// getter and setter method
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User string) {
		this.collegeAdmin = string;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}		
	@Override
	public String toString() {
		return "College [CollegeName=" + CollegeName + "]";
	}
}
