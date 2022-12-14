package com.cg.service;

import com.cg.dao.PlacementDao;
import com.cg.dao.PlacementDaoImpl;
import com.cg.entites.Placement;

public class PlacementServiceImpl implements PlacementService
{
private PlacementDao dao;
	
public PlacementServiceImpl() {
	super();
	dao=new PlacementDaoImpl();
}

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(long placement_id) {
		Placement placement=dao.searchPlacement(placement_id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(long placement_id) {
		dao.beginTransaction();
		boolean res=dao.cancelPlacement(placement_id);
		dao.commitTransaction();
		return res;
	}
	
}
