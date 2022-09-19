package com.cg.dao1;

import javax.persistence.EntityManager;

import com.cg.entities1.Employee;

public class IEmployeeDaoImpl implements IEmployeeDao
{
private EntityManager em ;
    
    public IEmployeeDaoImpl() {
    	super();
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public Employee addEmployee(Employee employee) {
		em.persist(employee);
		return employee;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		em.merge(employee);
		return employee;
	}
	@Override
	public Employee searchEmployee(long id) {
		Employee employee = em.find(Employee.class, id);
		return employee;
	}
	@Override
	public boolean deleteEmployee(long id) {
		em.remove(id);
		return false;
	}
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		}
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		}
}
