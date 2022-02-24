package com.capg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Akshat");
		s1.add("Vipin");
		s1.add("Mayur");
		s1.add("Rohit");
		s1.add("Vivek");
		s1.add("YAshraj");
		
		List<String> l1=s1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l1);
		long count= s1.stream().filter(s->s.length()==5).count();		
		System.out.println(count);
		List<String> l2=s1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		List<String> l3= s1.stream().sorted((t1,t2)->-t1.compareTo(t2)).collect(Collectors.toList());
		System.out.println(l3);
	}

}
