package com.capg.java8;

import java.util.function.Predicate;

public class Test7 {
	public static void main(String[] args) {
		int[] x= {5,3,7,10,84,75,77};
		
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i->i%2==0;
		m1(p1,x);
		System.out.println("-------------------");
		m1(p2,x);
		System.out.println("-------------------");
		 m1(p1.and(p2),x);
		 m1(p1.or(p2),x);
		
		
	}
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1: x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		
	}

}
