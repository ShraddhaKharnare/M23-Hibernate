package com.cg.serivice1;

import com.cg.entities1.Order;

public interface IOrderService 
{
	public abstract Order addOrder(Order order);
	public abstract Order updateOrder(Order order);
	public abstract Order searchOrder(long Order_id);
	public abstract Order cancelMall(long id);
}
