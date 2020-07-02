package com.pack.entity;

import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book
{
	@Id
private Integer bookid;
	@Column(length=20)
private String bookname;
	
@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JoinTable(name="BOOK_AUTHOR", joinColumns=@JoinColumn(name="bookid_fk"),inverseJoinColumns=@JoinColumn(name="authorid_fk"))
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
	return "Book [bookId=" + bookid + ", bookname=" + bookname + ", authors=" + authors + "]";
}

}
