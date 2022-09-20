package com.cg.service2;

import com.cg.entites2.Student;

public interface StudentService 
{
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);
}
