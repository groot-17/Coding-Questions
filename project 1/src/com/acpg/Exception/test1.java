package com.acpg.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {
 
 public static void main(String[] agrs) {
	 
 try {
	 Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter the valu of x: ");
   int x = sc.nextInt();
   System.out.println("Enter the valu of y: ");
   int y=sc.nextInt();
   int z=x/y;
   System.out.println("Division is: "+x/y);
   
 }
 catch(ArithmeticException e) {
	 System.out.println("Invalid input");
 }
 catch(InputMismatchException ip) {
	System.out.println(ip);
 }
}
}
