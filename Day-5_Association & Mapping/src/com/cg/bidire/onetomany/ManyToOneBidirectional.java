package com.cg.bidire.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneBidirectional
{

	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d=new Department();
		d.setId(12101);
		d.setDeptName("Finance");
		
		
		Employee e=new Employee();
		e.setEmpId(121);
		e.setEname("Shraddha");
		e.setSalary(45000.50f);	
				
		Employee e1=new Employee();
		e1.setEmpId(121);
		e1.setEname("Shreya");
		e1.setSalary(40000.50f);	
		
		
		e.setDept(d);
		e1.setDept(d);
		
		em.persist(e1);
		em.persist(e);
		
		System.out.println("Roes is inserted");
		em.close();
		factory.close();
		
	}

}
