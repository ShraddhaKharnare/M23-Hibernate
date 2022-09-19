package com.cg.joinedinheritance;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Manager2")
public class Manager extends Employee
{
	private static final long serialVersionUID = 1L;
	private String deptname;
	
	//Getters and setters methods
	public String getDeptname() 
	{
		return deptname;
	}
	public void setDeptname(String deptname) 
	{
		this.deptname = deptname;
	}
	
	
	
}
