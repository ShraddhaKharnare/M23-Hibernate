package com.cg.serivice1;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.dao1.ICustomerDao;
import com.cg.dao1.ICustomerDaoImpl;
import com.cg.entities1.Customer;

public class ICustomerServiceImpl implements ICustomerService
{
	private ICustomerDao dao ;
	 public ICustomerServiceImpl(){
		 super();
		 dao = new ICustomerDaoImpl();
		 }
	@Override
	public Customer searchItem(String itemName) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer orderItem(Item item) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer searchMall(long id) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer cancelOrder(long Order_Id) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
	return customer;
	}
}
