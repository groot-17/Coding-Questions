package com.capg.java8;

import java.util.ArrayList;
import java.util.Collections;

public class Test6 {
	public static void main(String[] args) {
		ArrayList<Product> l1 = new ArrayList<Product>();
		
		l1.add(new Product(101,"HP",30000));
		l1.add(new Product(102,"Dell",40000));
		l1.add(new Product(103,"Lenovo",28000));
		l1.add(new Product(104,"Asus",35000));
		l1.add(new Product(105,"HP",30000));
		
		Collections.sort(l1,(e1,e2)->(e1.getId()<e2.getId())?-1:(e1.getId()>e2.getId())?1:0);
		System.out.println(l1);
		
		
		
		
	}
 
}
