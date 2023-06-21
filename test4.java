package com.practice.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test4 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(9,0,5,1,6,4);
		l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
