package com.practice.example;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
	public static void main(String[] args) {
		//List<Employee> l1 = new EmployeeDao().getEmployees();
		
		/*
		 * Collections.sort(l1,(o1,o2)-> (int)(o1.getSalary()-o2.getSalary()));
		 * System.out.println(l1); l1.stream().sorted((o1,o2)->
		 * (int)(o1.getSalary()-o2.getSalary())).forEach(s->System.out.println(s));
		 */
		
		Set<Employees> set = new TreeSet<>();
		
		set.add(new Employees(101,"Vipin"));
		set.add(new Employees(103,"Vivek"));
		set.add(new Employees(102,"Kajal"));
		set.add(new Employees(104,"Yash"));
		
		System.out.println(set);
	}

}
