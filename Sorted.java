package com.practice.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorted {
	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(4,2,3,1,6,7,5,9);
		l1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
