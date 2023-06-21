package com.mbdri;

import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;



import com.practice.example.Duplicate;

public class stream {

//	Q1 Given a list of integers, find out all the numbers starting with 1 using
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
		List<Integer> l1 =  Arrays.asList(33,42,57,13,75,24,6,32,56,24,15,57,117,-11,5,2,-54,-65);
		
		
	Set<Integer> set = new HashSet<>();
	//set.add(l1.get(4));
	//l1.stream().filter(s->!set.add(s)).forEach(System.out::println);
	System.out.println("--------");
	List<String> l2=l1.stream().map(s->s+" ").filter(t->t.startsWith("1")).collect(Collectors.toList());
	System.out.println("Numbers starting with 1"+l2);
	Set<Integer> s1 = new HashSet<>();
    List<Integer> l3=	l1.stream().filter(s->!s1.add(s)).collect(Collectors.toList());
    System.out.println("Duplicate elements are:"+l3);
    int l4= l1.stream().findFirst().get();
    System.out.println("First element of the list is"+l4);
    long l5= l1.stream().max(Integer::compare).get();
    System.out.println("Max element from the given list is "+l5);
    List<Integer> l6= l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    double l7 = l1.stream().reduce(0,(a,b)->a+b);
	System.out.println("Average of the element present int the list is "+l7/l1.size());
    List<Integer> l8=	l1.stream().filter(a->a>0).collect(Collectors.toList());
    System.out.println("Positive element from the given list are"+l8);
    l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(1,"value1");
    map.put(8,"value8");
    map.put(3,"value3"); 
    map.put(6,"value6");
    map.put(4,"value4");
    map.put(7,"value7");
    map.put(2,"value2");

     
    	
    map.entrySet().stream().filter(m->m.getValue().equals("value2")).forEach(System.out::println);
    
    map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    
    for(Map.Entry<Integer,String> entry:map.entrySet()) {
    	if (entry.getValue().equals("value2")){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
    	
    }
	}
}
