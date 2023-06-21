package com.mbdri;

import java.security.PKCS12Attribute;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.example.New;

public class Coding60 {
//	1) print helloworld 10 times.
//o/p=  Hello world 1
//      Hello World 2 ....  
//      Hello World 10
//2) print the 3rd highest from array.
//3) reverse a given string. i/p="Capgemini"
//4) write a code to find missing number in Integer List
//Test cases :
//   a) 1,2,3,4,5,7,8,9,10
//   b)2,4,6,10,12,14,16,18,20
//   c)1,3,5,9,11,13,15,17
//5) Write a program to get the occurrence of a specific letter in a given String.
//i/p="Hello"
//i/p=l
//o/p=2 
//6) Write a java program for palindrome in normal way as well as using Command line arguments.
//i/p="MADAM"
//o/p MADAM is a Pallendrome
//
//7) Write a program to sort a given list of intergers in ascending order
//i/p list={2,4,0,1,56,23,4}
//o/p list={0,1,2,4,4,23,56}
//8) Write a program to check a given number is prime or not 
//i/p n=34
//9) write a program to a sort a Array of String in ascending oreder alphabetially
//i/p String s=["Capgemini","Accenture","TCS","EPAM"]
//o/p =[Accenture,Capgemini,EPAM,TCS]
//10) Write a program to check a given number is even or odd
//i/p n=34
//o/p = 34 is even number
//	11) write a program for fibonacci series;
//			12) write a program to return 2nd largest number from given array
//			   i/p=[2,3,5,6,1,0]
//			   o/p=6
//			13) Write a program to implement the defalut method in a Fuctional interface and override it.
//			14)write a program to Count the number of alphabets in a given sentence
//			    i/p="Capgemini"
//			    o/p = {C-1,a-1,p-1,g-1,e-1,m-1,i-2,n-1}
//			15)Write a program to store the List of prime numbers in a arrayList and print it.
//			16)Write a program to create POJO class of Product (Product Id, ProductName) and Store all values in any collection and Sort that values by ProductName in ascending order
//			17)write a program To count number of words in a given sentence.
//			 i/p "Hello world"
//			 o/p = 2 words  
//			18)Write a program to Reverse a string="Capgemini Training"
//			19)Write a program count Each vowel frequency in a String(String="capgemini training")
//			20)Create a class having Fields id,name ,salary and sort it based on id and name using comparator and comparable
	public static void main(String[] args) {
////		for(int i=1;i<=10;i++) {
////			System.out.println("Hello Worldc "+i);
////		}
//		int[] arr={6,2,76,32,1,765,113,54};
//		List l1 = Arrays.asList(6,2,76,32,1,765,113,54);
//	 // l1=	Arrays.asList(arr);
////System.out.println(l1);
//	System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst());
//	System.out.println(l1.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());	
//		String s1= new String("capgemini");
//		for(int i=s1.length()-1;i>=0;i--) {
//			System.out.print(s1.charAt(i));
//		}
		
//		int arr[] ={1,3,4,5,6,7,8,9};
//		int temp=arr[1]-arr[0];
//		int pre=0;
//		int next=1;
//		for(int i=0;i<arr.length;i++) {
//			int temp1=arr[next]-arr[pre];
//			if(temp==temp1) {
//				pre++;
//				next++;
//			}
//			else {
//				System.out.println(arr[pre]+temp);
//				break;
//			}
//			
//		}	
//		Map<Character, Integer> map = new HashMap<>();
//		String s1 = "Hello";
//		
//		for(int i=0;i<s1.length();i++) {
//			if(map.containsKey(s1.charAt(i))) {
//				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
//			}
//			else {
//				map.put(s1.charAt(i), 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}	
//Scanner scanner = new Scanner(System.in);
//		String s1 = args[0];
//		String s2="";
//		for(int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//		}
//		if(s1.equals(s2)) {
//			System.out.println(s1+" is palindrome");
//		}
//		else {
//			System.out.println(s1+" is not a palindrome");
//		}
//	int x=13;
//	boolean flag=true;
//	for(int i=2;i<x;i++) {
//		if(x%i==0) {
//			System.out.println("Given no is not prime");
//			flag=false;
//			break;
//		}
//
//	}
//	if(flag==true) {
//		System.out.println("GIven no is prime");
//	}
//	String[] s={"Capgemini","Accenture","TCS","EPAM"};
//List l1=	Arrays.asList(s);
//	
//		l1.stream().sorted().forEach(System.out::println);
//				
//	int prev=0;
//	int next =1;
//	int temp=0;
//	for(int i=0;i<10;i++) {
//		temp=prev+next;
//		prev++;
//		next++;
//		System.out.println(temp);	
//	}
//		int[] x= {2,3,5,6,1,0};
//	List l1=	Arrays.asList(x);
//	//System.out.println(l1);
//	//System.out.println(l1.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());	
//		System.out.println(Arrays.stream(x).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
//	String	s1="Hello world";
//	String[] s2= s1.split(" ");
//	System.out.println(s2.length);
		
//		EmployeeDTO{
//
//			 
//
//		    private UUID id;
//		    private String empName;
//		    private Integer salary;
//
//		 
//
//		    }
//
//		 
//
//		    final List<EmployeeDTO> empList = new ArrayList<>();  //consider this list already have 10 records with Unique records
//		    - Convert List to Simple Map using Streams Map<UUID, String>(key=ID,value=empName)

Map<Integer, String>  map = new HashMap<>();
map.put(1, "one");
map.put(2, "two");
map.put(3, "three");
map.put(4, "four");
map.put(5, "five");
//map.entrySet().stream().filter(m->m.getValue()=="two").forEach(System.out::print);
//	
//	for(Map.Entry<Integer, String> entry:map.entrySet()) {
//		if(entry.getValue()=="two") {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
//	}
//	map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println) ;
String str="communication";
Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
System.out.println(result);
String[] s1= {"raj","ram","mohan","raj","ram"};

System.out.println(Stream.of(s1).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));

System.out.println(Stream.of(str).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())));









	}}
