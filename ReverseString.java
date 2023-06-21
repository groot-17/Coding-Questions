package com.mbdri;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		String name="My name is Vipin";
	   String[] reverse=name.split(" ");
	   int index=name.lastIndexOf(" ");
	   
	   for(int i=index+1;i<name.length();i++) { 
		   System.out.print(name.charAt(i));
	   }
	   
	   for(int i=reverse.length-1;i>=0;i--) {
		   System.out.print(reverse[i]+" ");
	   }
	}

}
// abaababaaabccc
//a =7
//b=4
//c = 3
//d=1
//ccc
//ccc
//ccca
//cac

//b aaa c c c aaa b
//aaabbbcdcbbaaa