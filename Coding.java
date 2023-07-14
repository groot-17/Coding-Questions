package com.mbdri;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.example.New;

public class Coding {
	public static void main(String[] args) {
		String s1= "Communication";
		String s3="today is Monday";
		String[] s2= {"ram","raj","ram","mohan","raj"};
//		System.out.println("Reverse of String");
//		System.out.println(Stream.of(s1).map(s->new StringBuilder(s).reverse()).collect(Collectors.joining()));
//		System.out.println("String map");
//		System.out.println(Arrays.stream(s1.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));
		//System.out.println("Map");
	//	System.out.println(Stream.of(s1).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,Collectors.counting())));
		
		System.out.println(Arrays.stream(s1.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));
		System.out.println(Stream.of(s2).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));
		System.out.println(Stream.of(s1).map(s->new StringBuilder(s1).reverse()).collect(Collectors.joining()));
	int s4=s3.lastIndexOf(" ");
	System.out.println(Stream.of(s1.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));
	System.out.println(Stream.of(s2).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));
	//l1.stream().f
	
	//System.out.println(s3);
	
	}

}
