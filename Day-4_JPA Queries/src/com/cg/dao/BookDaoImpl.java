package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.cg.entities.Book;

public class BookDaoImpl implements BookDao
{
	private EntityManager em;
	

	public BookDaoImpl() {
		super();
		em=JPA_Util.getEntityManager();
	}

	@Override
	public Book getBookById(Integer id) {
		Book b=em.find(Book.class, id);
		return b;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String str="SELECT b FROM BOOK b WHERE b.title=:ptitle";
		TypedQuery<Book> query=em.createQuery(str,Book.class);
		query.setParameter("ptitle",title);
		return query.getResultList();
	}

	@Override
	public Long getBookCOunt() {
		String str="SELECT COUNT(b.id) FROM BOOK B";
		TypedQuery<Long> query=em.createQuery(str,Long.class);
		Long count=query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		String str="SELECT b FROM BOOK b WHERE b.author=:pAuthor";
		TypedQuery<Book> query=em.createQuery(str,Book.class);
		query.setParameter("pAuthor","%"+author+"%");
		return query.getResultList();
	}

	@Override
	public List<Book> getAllBooks() {
		Query query=em.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book>obj=query.getResultList();
		return obj;
	}

	@Override
	public List<Book> getBooksRange(Double low, double high) {
		String str="SELECT b FROM BOOK b WHERE b.prica between :low and high";
		TypedQuery<Book> query=em.createQuery(str,Book.class);
		query.setParameter("plow","low");
		query.setParameter("Phigh","high");
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return null;
	}

   
}
