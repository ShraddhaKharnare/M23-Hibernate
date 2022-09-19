package com.cg.serivice1;

import com.cg.dao1.IShopDao;
import com.cg.dao1.IShopDaoImpl;
import com.cg.entities1.Shop;

public class IShopServiceImpl implements IShopService
{
	private IShopDao dao ;
	 public IShopServiceImpl(){
		 super();
		 dao = new IShopDaoImpl();
}
	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}
	@Override
	public Shop updateShop(Shop shop) {
		dao.beginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}
	@Override
	public Shop searchShopById(long Shop_Id) {
		Shop shop = dao.searchShopById(Shop_Id);
		return shop;
	}
	@Override
	public boolean deleteShop(long Shop_Id) {
		dao.beginTransaction();
		boolean res= dao.deleteShop(Shop_Id);
		dao.commitTransaction();
		return res;
	}
}
