package com.cg.bidire.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
  @Id
  private int EmpId;
  private String Ename;
  private float salary;
  
  @ManyToOne(cascade=CascadeType.ALL)
  @JoinColumn(name="deptname")
  private Department dept;
  
  //geters and setters method

public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Department getDept() {
	return dept; 
    }
public void setDept(Department dept) {
	this.dept = dept;
}
}
