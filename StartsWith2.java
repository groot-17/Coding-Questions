package com.practice.example;

import java.util.Arrays;
import java.util.List;

public class StartsWith2 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(20,40,30,10,22,28);
		l1.stream().map(a->a+"").filter(s->s.startsWith("2")).forEach(System.out::println);
	}

}
