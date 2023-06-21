package com.mbdri;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//int num = scanner.nextInt();
	String string =scanner.next();
	//int temp=0;
	//int sum=0;
	
	/*while(num>0) {
		temp=num%10;
		sum=(sum*10)+temp;
		num=num/10;
		
		
	}
	System.out.println(sum);*/
	String string2="";
	for(int i=string.length()-1;i>=0;i--) {
		string2=string2+string.charAt(i);
	}
	System.out.println(string2);
	if(string.equals(string2)) {
		System.out.println("given String is Plaindrome");
	}
	else {
		System.out.println("given String is not a palandrome");
	}
	char[] string3= string.toCharArray();
	char[] string4=string2.toCharArray();
	Arrays.sort(string3);
	Arrays.sort(string4);
    System.out.println(string4.equals(3));	
	
}
}
