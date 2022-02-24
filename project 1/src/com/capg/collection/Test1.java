package com.capg.collection;

import java.util.ArrayList;

public class Test1 {
 public static void main(String[] args) {
	 ArrayList al= new ArrayList();
	  al.add("Vipin");
	  al.add(100);
	  al.add(null);
	  al.add("Vivek");
	  al.add(100);
	  al.add("Yashraj");
	  
	  System.out.println(al);
	  System.out.println("Size is: "+al.size());
	  System.out.println(al.remove(2));
	  System.out.println(al.remove("Vivek"));
	 
	 
 }
}
