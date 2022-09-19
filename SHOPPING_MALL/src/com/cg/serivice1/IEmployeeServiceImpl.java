package com.cg.serivice1;

import com.cg.dao1.IEmployeeDao;
import com.cg.dao1.IEmployeeDaoImpl;
import com.cg.entities1.Employee;


public class IEmployeeServiceImpl implements IEmployeeService
{
	private IEmployeeDao dao ;
	 public IEmployeeServiceImpl(){
		 super();
		 dao = new IEmployeeDaoImpl();
		 }
	 @Override
		public Employee addEmployee(Employee employee) {
			dao.beginTransaction();
			dao.addEmployee(employee);
			dao.commitTransaction();
			return employee;
		}
		@Override
		public Employee updateEmployee(Employee employee) {
			dao.beginTransaction();
			dao.updateEmployee(employee);
			dao.commitTransaction();
			return employee;
		}
		@Override
		public Employee searchEmployee(long Emp_id) {
			Employee employee = dao.searchEmployee(Emp_id);
			return employee;
		}
		@Override
		public boolean deleteEmployee(long Emp_id) {
			dao.beginTransaction();
			boolean res= dao.deleteEmployee(Emp_id);
			dao.commitTransaction();
			return res;
		}
}
