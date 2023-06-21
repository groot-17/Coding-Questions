package com.practice.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDao {
	public static void main(String[] args) {
		Set<Employee> set = new LinkedHashSet<>();
		set.add(new Employee(101,"Vipin",1000000));
		set.add(new Employee(103,"VIvek",800000));
		set.add(new Employee(107,"Kshitiz",900000));
		set.add(new Employee(104,"kajal",600000));
		set.add(new Employee(106,"Yashraj",500000));
		set.add(new Employee(109,"Priya",700000));
		System.out.println(set);
	}
//	public void getEmployees(){
////		ArrayList<Employee> list = new ArrayList<>();
////		
////		
////		list.add(new Employee(101,"Vipin",1000000));
////		list.add(new Employee(103,"VIvek",800000));
////		list.add(new Employee(104,"Kshitiz",900000));
////		list.add(new Employee(105,"kajal",600000));
////		list.add(new Employee(106,"Yashraj",500000));
////		list.add(new Employee(107,"Priya",700000));
////		return list;
//		
//		

	
		
	

}
