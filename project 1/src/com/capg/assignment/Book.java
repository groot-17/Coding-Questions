package com.capg.assignment;

public class Book {
	 
	private int isbnno;
	private String bookName;
	private String author;
	
	public Book(int isbnno, String bookName, String author) {
		super();
		this.isbnno = isbnno;
		this.bookName = bookName;
		this.author = author;
	}
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
