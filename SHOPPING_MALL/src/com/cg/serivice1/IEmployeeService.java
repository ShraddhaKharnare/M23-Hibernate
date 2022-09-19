package com.cg.serivice1;

import com.cg.entities1.Employee;

public interface IEmployeeService
{
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	public abstract Employee searchEmployee(long Emp_id);
	public abstract boolean deleteEmployee(long Emp_id);
}
