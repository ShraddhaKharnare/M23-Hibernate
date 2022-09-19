package com.cg.dao1;

import com.cg.entities1.User;

public interface IUserDao 
{
	public abstract User addNewUser(User user);
	public abstract User updateUser(User user);
	public abstract User deleteUser(long User_Id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
