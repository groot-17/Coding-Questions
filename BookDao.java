package com.practice.example;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBooks(){
		ArrayList<Book> b1 = new ArrayList<>();
		b1.add(new Book("A",100,1));
		b1.add(new Book("G",200,2));
		b1.add(new Book("C",150,5));
		b1.add(new Book("B",350,7));
		b1.add(new Book("E",250,3));
		b1.add(new Book("E",175,4));
		 return b1;
	}

}
