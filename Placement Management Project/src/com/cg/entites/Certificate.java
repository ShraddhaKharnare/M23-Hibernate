package com.cg.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Certificate")
public class Certificate
{
  @Id
  @Column(name="Cert_Id")
  private int cert_id;
  
  //@Column(name="Year")
  private int year;
  
  @OneToOne(mappedBy="Certificate")
  private Student student;
  
  @ManyToOne(cascade=CascadeType.ALL)
  private College college;
  
  //getters and setters method
public int getId() {
	return cert_id;
}
public void setId(int cert_id) {
	this.cert_id = cert_id;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}	
}
  
