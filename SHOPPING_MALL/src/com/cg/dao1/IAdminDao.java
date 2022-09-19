package com.cg.dao1;

import com.cg.entities1.Admin;

public interface IAdminDao 
{
	public abstract Admin addAdmin(Admin admin);
	public abstract Admin updateAdmin(Admin admin );
	public abstract Admin searchAdmin(long Admin_id);
	public boolean deleteAdmin(long Admin_id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
