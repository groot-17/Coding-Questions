package com.practice.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerInterface {


public static void main(String[] args) {
	
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		
		l1.stream().forEach(t-> System.out.println("print:"+t));
		
		String s1 = "Capgemnini";
	//List<String> l1	=s1.split("");
		List nameList=Arrays.asList("ram","raja","ram","mohan");
	
  System.out.println(Stream.of(s1).map(s->new StringBuilder(s).reverse()).collect(Collectors.joining("")));

Map<String, Long> result = Arrays.stream(s1.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
  System.out.println(result);
 System.out.println(nameList.stream().collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()))); 
} 
}
