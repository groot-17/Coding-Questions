package com.mbdri;

import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Palindrome1 {
	public static void main(String[] args) {
		String s1= "vipin";
////		String s2="";
////		for(int i=s1.length()-1;i>0;i++) {
////			s2=s2+s1.charAt(i);
////		}
//	IntStream
		String s2="";
		Stack stack = new Stack<>();
		for(int i=0;i<s1.length();i++) {
		   stack.push(s1.charAt(i));
		  
		}
		for(int i=0;i<s1.length();i++) {
			s2=s2+stack.pop();
			  
			}
		System.out.println(s2);
	}

}
