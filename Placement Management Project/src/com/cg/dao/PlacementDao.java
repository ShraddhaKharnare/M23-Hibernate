package com.cg.dao;

import com.cg.entites.Placement;

public interface PlacementDao 
{
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean cancelPlacement(long id);
	
	void commitTransaction();
	void beginTransaction();
}
