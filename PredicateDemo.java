package com.practice.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
    List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		
		
		
			
		l1.stream().filter(t-> t%2==0).forEach(t-> System.out.println("print even:"+t));
	} 
	

}
