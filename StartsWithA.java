package com.practice.example;

import java.util.Arrays;
import java.util.List;

public class StartsWithA {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("abc", "def","fgh","klm","akze" );
		
		l1.stream().map(m->m+"").filter(s->s.startsWith("a")).forEach(System.out::println);
		l1.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
	}

}
