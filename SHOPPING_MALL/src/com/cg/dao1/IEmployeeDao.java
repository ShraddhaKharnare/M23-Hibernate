package com.cg.dao1;

import com.cg.entities1.Employee;

public interface IEmployeeDao
{
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	public abstract Employee searchEmployee(long id);
	public boolean deleteEmployee(long id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
