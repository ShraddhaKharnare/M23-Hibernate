package com.cg.dao;

import com.cg.entites.Student;

public interface StudentDao
{
	//abstract method by default
		public abstract Student addStudent(Student student);
		public abstract Student updateStudent(Student student);
		public abstract boolean deleteStudent(int id);
		public abstract Student searchStudentById(int id);
		public abstract Student searchStudentByHallTicketno(int hallticketno);

        public abstract void beginTransaction();
        public abstract void commitTransaction();

}
