package com.cg.client;

import com.cg.entites.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class client 
{

	public static void main(String[] args) 
	{
		StudentService service=new StudentServiceImpl();
        
		Student s=new Student();
		
		/*
		//create operation
		s.setRollno(108);
		s.setName("Shraddha");
		service.addStudent(s);
		*/
         
		//create operation
		s.setRollno(109);
		s.setName("Shreya");
		service.addStudent(s);
		
		
		/*
	    //retrieve data
		s=service.getStudentById(108);
		System.out.println("Student rollno: "+s.getRollno());
		System.out.println("Student name: "+s.getName());
		*/
		
		/*
		//update
		s=service.getStudentById(108);
		s.setName("Harry");
		service.updateStudent(s);
		*/
		
		/*
		//delete
		s=service.getStudentById(108);
		service.deleteStudent(s);
		System.out.println("Data is deleted");
		*/
	}

}
