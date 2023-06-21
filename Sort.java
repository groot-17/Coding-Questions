package com.practice.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
	public static void main(String[] args) {
		ArrayList<Integer> l1 =new ArrayList<>();
		l1.add(5);
		l1.add(8);
		l1.add(3);
		l1.add(7);
		l1.add(6);
		l1.add(2);
		l1.add(1);
		
		//Collections.sort(l1);
		
		l1.stream().sorted().forEach(s->System.out.println(s));
		System.out.println(l1);
		l1.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		//System.out.println("++++++++++++++++++++++++");
		//l1.stream().sorted((a,b)->a>b?a:b).forEach(System.out::println);
 	}

}
