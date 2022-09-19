package com.cg.dao1;


import javax.persistence.EntityManager;

import com.cg.entities1.Admin;

public class IAdminDaoImpl implements IAdminDao
{
    private EntityManager em ;
    
    public IAdminDaoImpl() {
    	super();
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public Admin addAdmin(Admin admin) {
		em.persist(admin);
		return admin;
	}
	@Override
	public Admin updateAdmin(Admin admin) {
		em.merge(admin);
		return admin;
	}
	@Override
	public Admin searchAdmin(long Admin_id) {
		Admin admin = em.find(Admin.class, Admin_id);
		return admin;
	}
	@Override
	public boolean deleteAdmin(long Admin_id) {
		em.remove(Admin_id);
		return false;
	}
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		}
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		}
}