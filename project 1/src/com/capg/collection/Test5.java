package com.capg.collection;

import java.util.HashMap;

public class Test5 {
 public static void main(String[] args) {
	 HashMap m = new HashMap();
	 
	 m.put(300, "hasan");
		m.put(100, "rama");
		m.put(101, "ishika");
		m.put(102, "adarsh");
		m.put(103, "vipin");
		m.put(103, "capg");
		m.put(104,"capg");
		m.put(null, null);
		m.put(105, null);
		
		System.out.println(m);
		System.out.println("Size is : "+ m.size());
		System.out.println(m.get(106));//null
		System.out.println(m.remove(105));//null
		System.out.println("size is: " + m.size());//size is 7
		
		System.out.println(m.remove(106));//null
		
		System.out.println(m.remove(null, null));//true
		System.out.println(m.remove(103, "vipin"));//false
		
		System.out.println(m.isEmpty());//false
		
		System.out.println(m.values());//[rama, ishika, adarsh, capg, capg, hasan]
		
		System.out.println(m.keySet());//[100, 101, 102, 103, 104, 300]
		
		System.out.println(m.entrySet());//[100=rama, 101=ishika, 102=adarsh, 103=capg, 104=capg, 300=hasan]
			
 }
}
