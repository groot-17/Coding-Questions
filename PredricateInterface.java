package com.mbdri;

import java.util.function.Predicate;

public class PredricateInterface {
	public static void main(String[] args) {
		Predicate<Integer> predicate=s->(s>=10);
		
	System.out.println(predicate.test(45));	
	}

}
