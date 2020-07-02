package com.pack.entity;

import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer bookid;
@Column(length=20)
private String bookname;
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="BOOK_AUTHOR",joinColumns=@JoinColumn(name="bookid_fk"),inverseJoinColumns=@JoinColumn(name="authorid_fk"))
private Set<Author> authors;

public Book() 
{
	
}

public Book(Integer bookid, String bookname) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
}


public Integer getBookid() {
	return bookid;
}


public void setBookid(Integer bookid) {
	this.bookid = bookid;
}


public String getBookname() {
	return bookname;
}


public void setBookname(String bookname) {
	this.bookname = bookname;
}


public Set<Author> getAuthors() {
	return authors;
}


public void setAuthors(Set<Author> authors) {
	this.authors = authors;
}


@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authors=" + authors + "]";
}
}
