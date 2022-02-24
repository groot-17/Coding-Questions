package com.capg.assignment;

import java.util.ArrayList;

public class Library {
 private ArrayList<Book> booklist= new ArrayList<Book>();
 
 void addBook(Book book) {
	 booklist.add(book);
	 }
 boolean isEmpty() {
	 return booklist.isEmpty();
	 }
 ArrayList<Book>viewBookByAuthor(String author){
	 ArrayList<Book> requiredBooks = new ArrayList<Book>();
	 for (Book book : booklist) {
		 if(book.getAuthor().equals(author)) {
			 requiredBooks.add(book);
		 }
	 }
	 return requiredBooks;
 }
 public int countnoofbook(String bname) {
	 int count= 0;
	 for(Book book: booklist) {
		 if(book.getBookName().equals(bname)) {
			count++; 
		 }
	 }
	 return count;
 }
 ArrayList<Book> viewAllBooks(){
	 return booklist;
 }
}
