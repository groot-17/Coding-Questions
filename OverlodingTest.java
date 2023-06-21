package com.practice.example;

import java.util.PrimitiveIterator.OfDouble;

public class OverlodingTest {
	public static void main(String[] args) {
		
		
		MethodOverloding m1 = new MethodOverloding();
		System.out.println("Sum of two numbers:"+m1.sum(2, 5));
		System.out.println("Sum of three numbers:"+m1.sum(5, 7, 10));
		
		
	}

}
