package com.capg.java8;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
 public static void main(String[] args) {
	 ArrayList<Integer> l= new ArrayList<Integer>();
	  l.add(100);
	  l.add(500);
	  l.add(200);
	  l.add(300);
	  l.add(184);
	  
	  
	  Collections.sort(l,(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
	  System.out.println(l);
	  
 }
}
