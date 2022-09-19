
package com.cg.serivice1;

import com.cg.dao1.IOrderDao;
import com.cg.dao1.IOrderDaoImpl;
import com.cg.entities1.Order;

public class IOrderServiceImpl implements IOrderService
{

	private IOrderDao dao ;
	 public IOrderServiceImpl(){
		 super();
		 dao = new IOrderDaoImpl();
		 }
	@Override
	public Order addOrder(Order order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}
	@Override
	public Order updateOrder(Order order) {
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();
		return order;
	}
	@Override
	public Order searchOrder(long Order_id) {
		Order order= dao.searchOrder(Order_id);
		return order;
	}
	@Override
	public Order cancelMall(long id) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}	
}
