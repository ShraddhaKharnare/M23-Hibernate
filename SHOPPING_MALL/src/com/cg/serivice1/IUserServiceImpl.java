package com.cg.serivice1;

import com.cg.dao1.IUserDao;
import com.cg.dao1.IUserDaoImpl;
import com.cg.entities1.User;

public class IUserServiceImpl implements IUserService
{
	private IUserDao dao;
    public IUserServiceImpl() {
    	super();
    	dao = new IUserDaoImpl();
    }
	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}
	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}
	@Override
	public User login(User user) {
		
		return null;
	}
	@Override
	public boolean logout() {
		
		return false;
	} 
}
