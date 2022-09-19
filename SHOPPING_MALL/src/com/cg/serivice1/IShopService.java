package com.cg.serivice1;

import com.cg.entities1.Shop;

public interface IShopService 
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop searchShopById(long Shop_Id);
	public abstract boolean deleteShop(long Shop_Id);
}
