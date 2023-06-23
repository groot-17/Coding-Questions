package com.mbdri;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> s1=new ArrayList<>();
		
		s1.add(new Student(1,"vipin",99,23));
		s1.add(new Student(2,"vivek",84,23));
		s1.add(new Student(3,"kajal",73,23));
		s1.add(new Student(4,"priya",83,23));
		s1.add(new Student(5,"kshitiz",65,23));
		s1.add(new Student(6,"vaibhav",99,23));
		s1.add(new Student(7,"sourabh",76,23));
		s1.add(new Student(8,"tavneet",72,23));
		s1.add(new Student(9,"suraj",60,23));
		
	System.out.println(s1.stream().filter(s->s.getMarks()<=80).collect(Collectors.toList()));
//Map<Integer, Integer> map=	s1.stream().filter(c->c.getMarks()<=80).collect(Collectors.groupingBy(LinkedHashMap,Student::getRollNo,Student::getMarks));
	
LinkedHashMap<Integer, Integer> map=	s1.stream().filter(c->c.getMarks()<=80).collect(Collectors.toMap(Student::getRollNo, Student::getMarks,(marks1,marks2)->marks2,LinkedHashMap::new));
System.out.println(map);
		
		
			
		
	}

}
