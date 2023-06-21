package com.practice.example;

import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Set<Student> s1 = new TreeSet<Student>();
		
		s1.add(new Student(101, "Kshitiz", 20));
		s1.add(new Student(103, "dev", 22));
		s1.add(new Student(102, "suraj", 21));
		s1.add(new Student(104, "sourabh", 19));
		
		System.out.println(s1);
		
		
	}

	
	

}
