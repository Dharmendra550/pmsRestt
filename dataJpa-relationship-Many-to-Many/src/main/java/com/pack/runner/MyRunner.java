package com.pack.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

import com.pack.entity.Author;
import com.pack.entity.Book;
import com.pack.repository.BookRepository;

public class MyRunner implements CommandLineRunner 
{
@Autowired
ApplicationContext ctx;
	@Override
	public void run(String... args) throws Exception 
	{
   BookRepository bookRepo=(BookRepository)ctx.getBean("bookRepository");
     
   Book book1=new Book(1,"Java");
   Book book2=new Book(2,"SpringBoot");
   Book book3=new Book(3,"MySql");

    Author author1=new Author(101,"A");
    Author author2=new Author(102,"B");
    Author author3=new Author(103,"C");
    
    Set<Author> authorsSet1=new HashSet<Author>();
    authorsSet1.add(author1);
    authorsSet1.add(author2);
    
    Set<Author> authorsSet2=new HashSet<Author>();
    authorsSet2.add(author1);
    authorsSet2.add(author2);
    authorsSet2.add(author3);
    
    Set<Author> authorsSet3=new HashSet<Author>();
    authorsSet3.add(author2);
    authorsSet3.add(author3);
    
    book1.setAuthors(authorsSet1);
    book2.setAuthors(authorsSet2);
    book3.setAuthors(authorsSet3);
    
    bookRepo.save(book1);
    bookRepo.save(book2);
    bookRepo.save(book3);
    
	}
}
