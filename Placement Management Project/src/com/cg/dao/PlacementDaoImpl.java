package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entites.Placement;

public class PlacementDaoImpl implements PlacementDao
{
	//we are going to use EntityManager method-CRUD
private EntityManager em;
	
	public PlacementDaoImpl() 
	{
		super();
		em=JPA_Util.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement=em.find(Placement.class, id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(long id) {
		em.remove(id);
		return false;
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().commit();
		
	}
	

}
