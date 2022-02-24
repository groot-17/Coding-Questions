package com.capg.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Library lib = new Library();
	 int choice;
	 ArrayList <Book> ans= new ArrayList<Book>();
	 do {
	 
	 System.out.println("1. Add Book");
	 System.out.println("2. Display all book Details");
	 System.out.println("3. Search book by author");
	 System.out.println("4. Count no of books-by name");
	 System.out.println("5.Exit");
	 
	 System.out.println("Enter your Choice: ");
     choice= sc.nextInt();
	 switch(choice){
	 case 1:
		 System.out.println("Enter the isbn no: ");
		 int isbn = sc.nextInt();
		 System.out.println("Enter Book name");
		 String bname=sc.next();
		 System.out.println("Enter author name");
		 String authorename=sc.next();
		 Book book = new Book(isbn,bname,authorename);
		 lib.addBook(book);
	 
	 case 2:
		
		if(lib.isEmpty()) {
			System.out.println("The list is Empty\n\n");
			}
			else {
				
				ans=lib.viewAllBooks();
				for(Book bk: ans) {
				System.out.println("Book isbn: "+bk.getIsbnno());
				System.out.println("Book Name: "+bk.getBookName());
				System.out.println("Book Author: "+bk.getAuthor());
			}
		}
		break;
		
	 case 3:
		 if (lib.isEmpty())
			 System.out.println("This List is Empty");
		 else {
			 sc.nextLine();
			 System.out.println("Enter Author name");
			 String name=sc.nextLine();
			 int temp=0;
			 for(Book bk: ans)
			 {
				 if(bk.getAuthor().equals(name))
				 {
					 System.out.println("ISBN no: "+bk.getIsbnno());
					 System.out.println("Book Name: "+bk.getBookName());
					 System.out.println("Author Name: "+bk.getAuthor());
					 temp++;
				 }
			 }
			 if(temp==0) {
				 System.out.println("None of the book is published by the Author "+name);
			 }
			 else {
				 
			 }
		 }
	 
			 

	 case 4:
		 if(lib.isEmpty()) {
			 System.out.println("List is empty");
		 }
		 else {
			 sc.nextLine();
			 System.out.println("Enter name of book: ");
			 String bkname = sc.nextLine();
			 int count=lib.countnoofbook(bkname);
			 System.out.println("Total "+count+" "+bkname+" Books Avalible");
		 }
		 break;
	 case 5:
		 break;
		 
}
 }while(choice!=5);
	 }}
