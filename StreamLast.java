package com.practice.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StreamLast {
	public static void main(String[] args) {
		List<Integer> a= Arrays.asList(1,-3,6,3,-1,3,4,3,-3,2,56,64,11,53,14,81,18);
		Set<Integer> a1=new HashSet<>(); 
		/*
		 * a.stream().filter(m->!a1.add(m)).forEach(System.out::print);
		 * a.stream().map(m->m+"").filter(s->s.startsWith("1")).forEach(System.out::
		 * println); int first=a.stream().findFirst().get(); System.out.println(first);
		 * long count=a.stream().count(); System.out.println(count); long
		 * max=a.stream().max(Integer::compare).get(); System.out.println(max);
		 */
		//a.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		/*
		 * long avg= a.stream().reduce(0,(x,y)->x+y); System.out.println(avg/a.size());
		 */
		a.stream().filter(m->m>0).sorted().forEach(System.out::println);
	}
	

}
