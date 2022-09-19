package com.cg.entites;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Admin")

public class Admin
{
	@Id
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")	
	private long admin_id;
	private String name;
	private String password;

	//@OneToOne method for connecting user and admin table
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_id")
	private User user;
	
	
	//getters and setters method
	public long getId() {
		return admin_id;
	}
	public void setId(long admin_id) {
		this.admin_id = admin_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
