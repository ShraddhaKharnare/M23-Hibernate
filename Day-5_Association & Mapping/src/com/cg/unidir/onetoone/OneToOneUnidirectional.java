package com.cg.unidir.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectional 
{
    //program on unidirectional
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("Shraddha");
		s.setPercentage(85.90f);
		
		Address a=new Address();
		a.setStreetno(128);
		a.setArea("Chakki Naka");
		a.setCity("Kalyan");
		a.setState("Maharashtra");
		
		s.setAddress(a);
		
		em.persist(s);
		System.out.println("Row is inserted ");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
