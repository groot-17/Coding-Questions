package com.practice.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Stram {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(9,5,3,7,1,3,9,3,5,2,8,11,18,22,53);
		//starting with one
		l1.stream().map(m->m+" ").filter(f->f.startsWith("1")).forEach(System.out::print);
		Set<Integer> set =new HashSet<Integer>();
		//duplicate value
		l1.stream().filter(n->!set.add(n)).forEach(System.out::println);
		// first element
		l1.stream().findFirst().ifPresent(System.out::println);
		//count elements
	    long count=l1.stream().count();
	    System.out.println(count); 
	    //max element
	   int max= l1.stream().max(Integer::compare).get();
	   // reverse sorting
	   l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
 
	   System.out.println(max);
	  
	   
		
	}

}
