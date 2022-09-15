package com.cg.service;

import com.cg.entites.Admin;

public interface AdminService 
{
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin login(Admin admin);
	boolean logout();
}
