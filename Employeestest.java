package com.mbdri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import com.practice.example.New;

public class Employeestest {
	
	public static void main(String[] args) {
	 Set<Employees> l1 = new HashSet<>();
//		l1.addAll(new Employees(1, "vipin", 25000) );
		l1.add(new Employees(2, "vivek", 25000) );
		l1.add(new Employees(3, "sourabh", 25000) );
		l1.add(new Employees(4, "tavneet", 25000) );
		l1.add(new Employees(5, "kshitiz", 25000) );
		l1.add(new Employees(6, "ayush", 25000) );
		l1.add(new Employees(7, "suraj", 25000) );
		l1.add(new Employees(8, "dev", 25000) );
		l1.add(new Employees(9, "kajal", 25000) );
		l1.add(new Employees(10, "priya", 25000) );
		l1.add(null);
		System.out.println(l1);
	 
	 

	 
		
//	Map<Integer, String> m2 =(Map<Integer, String>) l1.stream().collect(Collectors.toMap(Employees::getId, Employees::getEmpName));
//	 System.out.println(m);
//		Enter data into HashMap where value is a name and key is the length of the name
		//Print the repeated values in the list using stream - 1,2,3,4,5,5
//		Multiply each value in the list by 2 and print output using strea
//	   
//		List<Integer> l3 =Arrays.asList(1,2,3,4,5,5);
//		Map<String, Integer> map = new HashMap<>();
//		List<Integer> l2= Arrays.asList(1,2,3,4,5);
//		
//		l3.stream().map(m->m*2).forEach(System.out::println);
//		
//		List a1=Arrays.asList("vipin","viveke","kajali");
//		Map<List<String> ,Integer> map1=new HashMap<>();
//		
//	System.out.println(a1.stream().collect(Collectors.toMap(a->a.toString().length(), b->b)));
//	List a2=new ArrayList<>();
//	for(Map.Entry<List<String>, Integer> entry:map1.entrySet()) {
//		for(int i=0;i<map1.size()-1;i++) {
//			if(entry.getValue()==map1.get(i)) {
//				map1.put(a2.add(entry.getKey()), map1.get(i));
//			}
//		}
//	}
	  
	 // System.out.println(result);
//		for(int i=0;i<a1.size();i++) {
//			//map.put(map.get(a1.get(i)).toString().length(),"vipin" )));
//			map1.put((a1.get(i).toString().length()), a1.get(i));
//		}
//			//System.out.println(map);
//	
//	String s1="Devraj";
//	String s2="<<>>";
//	
//	int x= s2.length()/2;
//	String s3="";
//	 s3=s2.substring(x);
//	 System.out.println(s2.substring(0,2)+s1+s2.substring(x));
//	 
//	 String string ="Hello World";
//	String[] c1= string.split(" ");
//		System.out.println(c1.length);
	//System.out.println(string.substring(1));	
//		
//		int n=101;
//		int o=n;
//		
//		int sum =0;
//		int temp;
//		while(n>0) {
//			temp=n%10;
//			sum=sum*10+temp;
//			n=n/10;
//		}
//		System.out.println("sum"+sum);
//		if(sum==o) {
//			System.out.println("given no is palindrome");
//		}
//		else {
//			System.out.println("given no is not a palindrome");
//		}
//		
//		String azString="welcome";
//	//System.out.println(azString.charAt(1));	
//		for(int i=0;i<azString.length()-1;i++) {
//			System.out.print(azString.charAt(i)+""+azString.charAt(i));
//		}
//	List w1=Arrays.asList("Capgemini","capgemini","infosys");
//Set s4= new HashSet<>();
//	w1.stream().map(a->a.toString().toLowerCase()).filter(s->s4.add(s)).forEach(System.out::println);
//	List x1=Arrays.asList("vipin","vivek","priya","vipin","vivek");
//	Map<String,Integer> q2= (Map<String, Integer>) x1.stream()
//			  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//			
//			System.out.println(q2);
	String line = "Today is Monday";
int index=	line.lastIndexOf(" ");
		System.out.println((line.substring(index+1)).length());
		
System.out.println(Stream.of(line).map(s->s.substring(s.lastIndexOf(" ")).length())); 
			
	}   

}
