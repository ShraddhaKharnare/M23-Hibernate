package com.cg.dao1;

import com.cg.entities1.Shop;

public interface IShopDao 
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop searchShopById(long Shop_Id);
	public boolean deleteShop(long Shop_Id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
