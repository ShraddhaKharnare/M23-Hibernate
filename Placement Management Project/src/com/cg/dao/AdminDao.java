package com.cg.dao;

import com.cg.entites.Admin;

public interface AdminDao 
{
	public Admin addNewAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(long id);
	
	void beginTransaction();
	void commitTransaction();	

}
