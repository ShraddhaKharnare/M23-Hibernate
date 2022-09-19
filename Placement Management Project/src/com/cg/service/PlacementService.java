package com.cg.service;

import com.cg.entites.Placement;

public interface PlacementService 
{
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long placement_id);
	boolean   cancelPlacement(long placement_id);
}
