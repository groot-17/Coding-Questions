package com.practice.example;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeesTest {
	public static void main(String[] args) {
		ArrayList<Employees> b1 = new ArrayList<>();
		b1.add(new Employees(1,"Vipin"));
		b1.add(new Employees(4,"Sourabh"));
		b1.add(new Employees(3,"Sudeep"));
		b1.add(new Employees(2,"Arnab"));
		
		b1.stream().sorted().forEach(System.out::println);
		//b1.stream().sorted(().forEach(System.out::println);
		
		
		
	}
	
	
	
	

}
