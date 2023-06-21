package com.practice.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TheFinalPractice {
	
//	  Q1 Given a list of integers, find out all the numbers starting with 1 using
//	  Stream functions?
//	  
//	  Q2 How to find duplicate elements in a given integers list in java using
//	  Stream functions?
//	  
//	  Q3 Given the list of integers, find the first element of the list using
//	  Stream functions?
//	  
//	  Q4 Given a list of integers, find the total number of elements present in the
//	  list using Stream functions?
//	  
//	  Q5 Given a list of integers, find the maximum value element present in it
//	  using Stream functions?
//	  
//	  Q6 Given a list of integers, sort all the values present in it in descending
//	  order using Stream functions?
//	  
//	  Q7. write a stream program to accept 3,7,8,1,12,13 and find out the average
//	  of value.
//	  
//	  Q8. series 11,14,13,45,20,-20 stream program to accept positive value and
//	  display sorted order.
//	  
//	  Q9. accept you,exe,ooo,xyz,zzz,write stream program to pick up words whose
//	  all characters are same
//	  
//	  Q10. write a stream prgm to accept " abc, def,fgh,klm,akze ".Find out the
//	  word which start with "a" alphabet? output - abc,akze
//	  
//	  Q11. write a stream program accept series 20,40,30,10,22,28. pickup only
//	  numbers starts with 2. out put -20,22,28
//	  
//	  Q12. Accept a number series 22,322,607,70. Write a stream progam that accepts
//	  only two digits numbers.
//	  
//	  Q13. In a series 22,42,56,39, write a stream program that will pick up those
//	  words ends 2.
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		LinkedList<Integer> ll1= new LinkedList<>();
		LinkedList<Integer> l21= new LinkedList<>();
		
		
		l1.add(74);
		l1.add(44);
		l1.add(24);
		l1.add(64);
		l1.add(-44);
		l1.add(11); 
		l1.add(16);
		l1.add(-33);
		l1.add(92);
		l1.add(93);
		l1.add(4);
		l1.add(1);
		System.out.println("--------------StartsWith 1-----------------Q1");
		l1.stream().map(n-> n+" ").filter(s->s.startsWith("1")).forEach(System.out::println);
		Set<Integer> s1 = new HashSet<>();
		System.out.println("--------------Duplicate-----------------Q2");
		List<Integer> l2= l1.stream().filter(n->!s1.add(n)).collect(Collectors.toList());
		int[]arr = new int [l2.size()];
		System.out.println("---------------First----------------Q3");
		int first= l1.stream().findFirst().get();
		System.out.println(first);
		System.out.println("------------NOOf Elements-------------------Q4");
	    long count = l1.stream().count();
	    System.out.println(count);
	    System.out.println("---------------Max----------------Q5");
	    int max= l1.stream().max(Integer::compare).get();
	    System.out.println(max);
	    System.out.println("-------------------Reversed order------------Q6");
	    l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	    System.out.println("--------------Average-----------------Q7");
	   double sum= l1.stream().reduce(0,(a,b)->a+b);
	   System.out.println(sum/l1.size());
	   System.out.println("-------------Positive values in sorted order------------------Q8");
	   l1.stream().filter(m->m>0).sorted().forEach(System.out::println);
	   System.out.println("---------------Ends With 2----------------Q13");
	   l1.stream().map(m->m+"").filter(s->s.endsWith("2")).forEach(System.out::println);
	    
	   int second= l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	     System.out.println("Second highest element"+second);
	     //Collections.reverse(l1);
	    // l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	    Collections.sort(l1);
	   System.out.println(l1.remove(l1.size()-1)); 
	  int second1= l1.stream().sorted(Comparator.reverseOrder()).findFirst().get();	
	  //int second1= l1.stream().findFirst().get(); 
	  System.out.println("SECOND HIGHEST"+second1);
	     
	     
	   Map<Integer, Integer> m1 = new HashMap<>();
	   
	   for(int i=0;i<l1.size();i++) {
		   int element = l1.get(i);
		   if(m1.containsKey(element)) {
			   m1.put(element, m1.get(element)+1);
		   }
		   else {
			m1.put(element, 1);
		}
		   
	   }
	    
	   System.out.println(m1);
	   m1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//		
//	   int rem;
//		LinkedList<Integer> l3 = new LinkedList<>();
//       for(int i=l1.size()-1;i<0;i++){
//       	if(rem>1) {
//           if(ll1.get(i)+ll2.get(i)+1>10)
//
//           rem = ll1.get(i)+ll2.get(i)+1%10;
//           
//           l3.add(rem);
//           }
//       	else {
//       		rem = ll1.get(i)+ll2.get(i)%10;
//            
//            l3.add(rem);
//       		
//       	}
//           
       
	}
}
