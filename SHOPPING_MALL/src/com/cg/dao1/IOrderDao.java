
package com.cg.dao1;

import com.cg.entities1.Order;

public interface IOrderDao 
{
public abstract Order addOrder(Order order);
public abstract Order updateOrder(Order order);
public abstract Order searchOrder(long id);
public abstract Order deleteOrder(long id);

public abstract void commitTransaction();
public abstract void beginTransaction();
}
