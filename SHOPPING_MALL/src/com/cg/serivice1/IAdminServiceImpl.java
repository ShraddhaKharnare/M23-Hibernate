package com.cg.serivice1;

import com.cg.dao1.IAdminDao;
import com.cg.dao1.IAdminDaoImpl;
import com.cg.entities1.Admin;

public class IAdminServiceImpl implements IAdminService
{
	private IAdminDao dao ;
	 public IAdminServiceImpl(){
		 super();
		 dao = new IAdminDaoImpl();
		 
	 }
	@Override
	public boolean approveNewShop(Admin admin) {
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();
		return false;
	}
}
