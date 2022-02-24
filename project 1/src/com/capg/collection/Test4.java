package com.capg.collection;

import java.util.TreeSet;

public class Test4 {
 public static void main(String[] args) {
	 TreeSet<String> ts = new TreeSet<String>();
	 ts.add("Yash");
	 ts.add("AAlok");
	 ts.add("Ayush");
	 ts.add("Vipin");
	 ts.add("Vivek");
	 ts.add("Yashraj");
    
	 System.out.println(ts);
	 System.out.println(ts.descendingSet());
	 
	 
 }
 }
