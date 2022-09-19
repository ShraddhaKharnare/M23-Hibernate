package com.cg.serivice1;

import com.cg.entities1.User;

public interface IUserService
{
	public abstract User addNewUser(User user);
	public abstract User updateUser(User user);
	public abstract User login(User user);
	public abstract boolean logout();
}
