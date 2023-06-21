package com.mbdri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		Map<Integer,Employee> l1 = new TreeMap<>();
		
		Set<Employee> l2 = new TreeSet<>();
		
		l1.put(1,new Employee(1,"vipin",30000));
		l1.put(4,new Employee(5,"vivek",53000));
		l1.put(5,new Employee(7,"yashraj",35000));
		l1.put(6,new Employee(2,"kshitiz",25000));
		l1.put(3,new Employee(3,"sourabh",28000));
		l1.put(2,new Employee(6,"pajji",39000));
		System.out.println(l1);
		
		l2.add(new Employee(1,"vipin",30000));
		l2.add(new Employee(5,"vivek",53000));
		l2.add(new Employee(7,"yashraj",35000));
		l2.add(new Employee(2,"kshitiz",25000));
		l2.add(new Employee(3,"sourabh",28000));
		l2.add(new Employee(6,"pajji",39000));
		System.out.println(l2);
		
		l2.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);
		l1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
