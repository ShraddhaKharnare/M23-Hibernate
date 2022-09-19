package com.cg.dao1;

import javax.persistence.EntityManager;

import com.cg.entities1.User;

public class IUserDaoImpl implements IUserDao
{
private EntityManager em ;
    
    public IUserDaoImpl() {
    	super();
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public User addNewUser(User user) {
		em.persist(user);
		return user;
	}
	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}
	@Override
	public User deleteUser(long User_Id) {
		em.remove(User_Id);
		return null;
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
