package cpm.cg.tableperclassinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.joinedinheritance.Employee;

@Entity
@Table(name="Manager1")
public class Manager1 extends Employee
{
	private static final long serialVersionUID = 1L;
	private String deptname;
	
	//Getters and setters methods
	public String getDeptname() 
	{
		return deptname;
	}
	public void setDeptname(String deptname) 
	{
		this.deptname = deptname;
	}
	

}
