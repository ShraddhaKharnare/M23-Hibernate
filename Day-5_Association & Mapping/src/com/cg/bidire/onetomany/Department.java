package com.cg.bidire.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department
{
	@Id
	@Column(name="Id")
	private int Id;
	
	@Column(name="department")
	private String DeptName;
	
	
	
	//Getters and Setter method
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", DeptName=" + DeptName + "]";
	}
	
}
