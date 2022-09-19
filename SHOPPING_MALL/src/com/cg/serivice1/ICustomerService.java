package com.cg.serivice1;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.entities1.Customer;

public interface ICustomerService 
{
	public abstract Customer searchItem(String itemName);
	public abstract Customer orderItem(Item item);
	public abstract  Customer searchMall(long id);
	public abstract Customer cancelOrder(long Order_Id);
	public abstract Customer updateCustomer(Customer customer);
}
