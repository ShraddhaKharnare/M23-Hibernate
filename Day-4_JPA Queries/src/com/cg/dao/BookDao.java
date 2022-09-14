package com.cg.dao;

import java.util.List;
import com.cg.entities.Book;

public interface BookDao 
{
   public abstract Book getBookById(Integer id);
   public abstract List<Book> getBookByTitle(String title);
   public abstract Long getBookCOunt();
   public abstract List<Book> getBookByAuthor(String author);
   public abstract List<Book> getAllBooks();
   public abstract List<Book> getBooksRange(Double low, double high);
   public abstract Long getBookCount();
}
