package com.practice.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectMapSort {
 
	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<>();
		map.put(new Employee(101,"Vipin",1000000), 101);
		map.put(new Employee(103,"VIvek",800000),103);
		map.put(new Employee(104,"Kshitiz",900000),107);
		map.put(new Employee(105,"kajal",600000),102);
		map.put(new Employee(106,"Yashraj",500000),104);
		map.put(new Employee(107,"Priya",700000),105);
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);	
		
		
	}
		
		
	
}
