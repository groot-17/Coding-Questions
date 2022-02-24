package com.capg.collection;

import java.util.TreeSet;

public class Test3 {
 public static void main(String[] args) {
	 TreeSet<Integer> ts = new TreeSet<Integer>();
	  ts.add(-10);
	  ts.add(30);
	  ts.add(300);
	  ts.add(200);
	  ts.add(1976);
	   System.out.println(ts);
	   System.out.println(ts.descendingSet());
 }
}
