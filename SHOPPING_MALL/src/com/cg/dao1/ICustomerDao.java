package com.cg.dao1;

import com.cg.entities1.Customer;

public interface ICustomerDao 
{
	public abstract Customer addCustomer(Customer customer);
	public abstract Customer updateCustomer(Customer customer);
	public abstract Customer searchCustomer(long id);
	public abstract Customer deleteCustomer(long id);
	
	 public abstract void beginTransaction();
	 public abstract void commitTransaction();
}
