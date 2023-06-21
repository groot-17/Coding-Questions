package com.practice.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public void compareBooks()
	{
	
	List<Book> b1 = new BookDao().getBooks();
	
	//Collections.sort(b1,(o1,o2)->o2.getBookName().compareTo(o1.getBookName()) );
    //b1.stream().sorted((o1,o2)->o1.getPage()-(o2.getPage())).forEach(System.out::println);
    
	b1.stream().sorted((o1,o2)->o1.getBookName().compareTo(o2.getBookName())).forEach(System.out::println);
	
	//return b1;
	}
	public static void main(String[] args) {
		new BookService().compareBooks();
	}
}


/*
 * class MyCompractor implements Comparator<Book>{
 * 
 * @Override public int compare(Book o1, Book o2) { return
 * o2.getBookName().compareTo(o1.getBookName()); }
 * 
 * }
 */


