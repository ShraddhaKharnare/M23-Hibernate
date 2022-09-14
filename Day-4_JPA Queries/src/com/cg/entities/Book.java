package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="book")
@NamedQueries(@NamedQuery(name="getAllBooks", query="SELECT b from BOOK b"))
public class Book implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
   private Integer Id;
   private String tile;
   private String Author;
   private Double price;
   
   //Getters and Setters method
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getTile() {
	return tile;
}
public void setTile(String tile) {
	this.tile = tile;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [Id=" + Id + ", tile=" + tile + ", Author=" + Author + ", price=" + price + "]";
}
	
}
