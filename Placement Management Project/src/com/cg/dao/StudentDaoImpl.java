package com.cg.dao;

import javax.persistence.EntityManager;
import com.cg.entites.Student;

public class StudentDaoImpl implements StudentDao
{

	private EntityManager em;
	
	public StudentDaoImpl() 
	{
		super();
		em=JPA_Util.getEntityManager();
	}
	@Override
	public Student addStudent(Student student) {
		em.persist(student);
		return student;
	}



	@Override
	public Student updateStudent(Student student) {
		em.merge(student);
		return student;
	}


	@Override
	public boolean deleteStudent(int id) {
		em.remove(id);
		return false;
	}



	@Override
	public Student searchStudentById(int id) {
		Student student=em.find(Student.class,id);
		return student;
	}



	@Override
	public Student searchStudentByHallTicketno(int hallticketno) {
		Student student=em.find(Student.class,hallticketno);
		return student;
	}



	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}



	@Override
	public void commitTransaction() {
		em.getTransaction().commit();

		
	}
	}

	


