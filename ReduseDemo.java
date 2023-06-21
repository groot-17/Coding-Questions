package com.practice.example;

import java.security.Identity;
import java.util.Arrays;
import java.util.List;

public class ReduseDemo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		List<String> list1=Arrays.asList("Corejava","springboot","hibernate");
		
		int n=list.stream().reduce(0,(a,b)->a>b ? a:b);
		System.out.println(n); 
		int sum=list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		int mul=list.stream().reduce(1 ,(a,b)->a*b);
		System.out.println(mul);
		String longest= list1.stream().reduce((l1,l2)->l1.length()>l2.length()?l1:l2).get();
		System.out.println(longest);

}
}