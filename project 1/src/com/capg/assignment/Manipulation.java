package com.capg.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manipulation{
	List<Contact> phoneBook = new ArrayList<Contact>();
	Scanner sc = new Scanner(System.in);
	
	public void insert() {
		System.out.println("Enter First Name:- ");
		String Fname=sc.nextLine();		
		System.out.println("Enter Last Name:- ");
		String Lname=sc.nextLine();	
		System.out.println("Enter Phone Number :- ");
		long phoneno=sc.nextLong();	
		System.out.println("Enter Email:- ");
		String Email=sc.next();
		Contact cn = new Contact(Fname,Lname,phoneno,Email);
		phoneBook.add(cn);
	}
	public void display() {
		if(phoneBook.isEmpty()) {
			System.out.println("The list is Empty\n\n");
			}
		else
		System.out.println(phoneBook);
	}
	public Contact viewContactGivenPhone(long phoneNumber) {
		for(Contact c: phoneBook) {
			if(c.getPhoneNo()==phoneNumber) {
				System.out.println(c);
			}
		}
		return null;
	}
	public boolean removeContact(long phoneNumber) {
		for(Contact c:phoneBook) {
			if(c.getPhoneNo()==phoneNumber) {
				phoneBook.remove(c);
				return true;
			}
			
		}
		return false;
		
	}
	
	
	
}