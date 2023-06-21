package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamQuestion {
	public static void main(String[] args) {
		// Given a list of integers, find out all the even numbers exist in the list using Stream functions?
		List<Integer> l1 =Arrays.asList(22,86,75,32,55,77,64,88,356,88,943,53,53,12,66,64,53,55);
		Set s1 = new LinkedHashSet<>();
		
		//l1.stream().filter(s->s%2==0).forEach(System.out::println);
		//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		//l1.stream().map(m->m+" ").filter(s->s.startsWith("1")).forEach(System.out::println);
		//How to find duplicate elements in a given integers list in java using Stream functions?
		//l1.stream().filter(m->!s1.add(m)).forEach(System.out::println);
		//Given the list of integers, find the first element of the list using Stream functions?
		//long first=l1.stream().findFirst().get();
		//System.out.println(first);
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
		//long count = l1.stream().count();
		//System.out.println(count);
		//Given a list of integers, find the maximum value element present in it using Stream functions?
		//long count = l1.stream().count();
		String input = "Java Hungry Blog Alive is Awesome";
		char[] ch=input.toLowerCase().toCharArray();
		List<char[]> l2 = Arrays.asList(ch);
		 List l3=  l2.stream().filter(m->s1.add(m)).collect(Collectors.toList());
		Character cr= (Character) l3.stream().findFirst().get();
		System.out.println(cr);
	} 

}
