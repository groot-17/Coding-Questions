package com.practice.example;

import java.util.Arrays;
import java.util.List;

public class Count {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		long count=l1.stream().count();
		System.out.println(count);
	}

}
