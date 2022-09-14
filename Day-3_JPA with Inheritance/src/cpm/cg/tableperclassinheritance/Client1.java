package cpm.cg.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.singleinhertance.Employee;
import com.cg.singleinhertance.Manager;

public class Client1 
{
	public static void main(String[]args)
	 {
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		 EntityManager em=factory.createEntityManager();
		 em.getTransaction().begin();
		 
		 
		     //create an employee1
		     Employee e1=new Employee();
		     e1.setName("Shraddha");
		     e1.setSalary(40000);
		     em.persist(e1);
	 
		    //create an employee2
			 Employee e2=new Employee();
			 e2.setName("Priya");
			 e2.setSalary(3000);
			 em.persist(e2);
			 
			//create an manager
			 Manager m=new Manager();
			 m.setName("Sumit");		
			 m.setDeptname("Information Technology");
			 em.persist(m);
			 
			 em.getTransaction().begin();
			 System.out.println("Data is Inserted");
			 em.close();
			 factory.close();
	 }
}
