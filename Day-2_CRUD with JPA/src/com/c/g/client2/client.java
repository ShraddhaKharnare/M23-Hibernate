package com.c.g.client2;

import com.cg.entites2.Student;
import com.cg.service2.StudentService;
import com.cg.service2.StudentServiceImpl;

public class client 
{

	public static void main(String[] args) 
	{
		
		Student s=new Student();
		StudentService service=new StudentServiceImpl();
		
		
		/*//create Operation
		s.setRollno(101);
		s.setName("Sumit");
		service.addStudent(s);*/
		
		/*//create Operation
		s.setRollno(102);
		s.setName("Krutika");
		service.addStudent(s);*/
		
		/*//retrieve data
		s=service.getStudentById(102);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());*/
		
		/*//update
		s=service.getStudentById(102);
		s.setName("Hariom");
		service.updateStudent(s);*/
		
		//delete
		s=service.getStudentById(101);
		service.deleteStudent(s);
		System.out.println("Data is deleted");



	}
	

}
