package com.practice.example;



public class Book {
	private String bookName;
	private int page;
	private int id;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book(String bookName, int page, int id) {
		super();
		this.bookName = bookName;
		this.page = page;
		this.id = id;
	}
	public Book() {
		super();
		
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", page=" + page + ", id=" + id + "]";
	}
	
	

}
