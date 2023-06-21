package com.practice.example;

public class string {
public static void main(String[] args) {
	String s1 ="This is Monday";
	int index=s1.lastIndexOf(" ");
	int s2=s1.substring(index+1,s1.length()).length();
	
	System.out.println(s2);
}
}
