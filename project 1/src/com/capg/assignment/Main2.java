package com.capg.assignment;

import java.util.Scanner;

public class Main2 {
 public static void main(String[] args) {
	 Manipulation m1 = new Manipulation();
	 Scanner sc= new Scanner(System.in);
	 do {
	 System.out.println("1.Add Contact\r\n"
	 		+ "2.Display all contacts\r\n"
	 		+ "3.Search contact by phone \r\n"
	 		+ "4.Remove contact\r\n"
	 		+ "5.Exit\r\n"
	 		+ "Enter your choice: "
	 		);
	 int choice=sc.nextInt();
	 switch(choice){
	 
	 case 1:
	 m1.insert();
	 break;
	 case 2:
	 m1.display();
	 break;
	 case 3:
		 System.out.println("Enter Phone number: ");
	 sc.nextLine();
	 long phoneNumber=sc.nextLong();
	 m1.viewContactGivenPhone(phoneNumber);
	 break;
	 case 4:
		 System.out.println("Enter Phone number: ");
		 sc.nextLine();
		 long pn=sc.nextLong();
		 m1.removeContact(pn);
		 break;
	 default:
		 System.out.println("Invalid Choice");
	 }
	 }while(true);
	
 }
}
