package com.practice.example;

import java.util.Scanner;

public class StringManipulation {
	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		   String email = sc.next();

		   String regex="[a-zA-Z0-9+_.-]+@[a-zA-z0-9._-]+$";
		   boolean result = email.matches(regex);
			if(result){
		           System.out.println("Email is valid");        
		}
		else{
		System.out.println("Email is invalid");
		}
			String[] arr= email.split("@");
		    System.out.println(arr[0]);

		}
	

}
