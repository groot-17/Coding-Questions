package com.capg.collection;

import java.util.TreeMap;

public class Test6 {
	
	public static void main(String[] args) {
		
		
		TreeMap tm = new TreeMap();
		
		tm.put(104,4.5);
		tm.put(100, "rama");
		tm.put(101,"vipin");
		tm.put(102, "ishika");
		tm.put(103, "capg");
		tm.put(103, "capgemini");
		tm.put(105, "capgemini");
		//invalid: null values are not allowed tm.put(null, "capg");
		tm.put(106, null);
		//invalid: tm.put("abc",123);->java.lang.ClassCastException
		
		
		
		
		System.out.println(tm);
		
	}

}