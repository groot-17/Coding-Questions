package com.mbdri;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num=scanner.nextInt();
		int temp=0; 
		int sum=0;
		while(num>0) {
			
			temp=num%10;
			sum=(sum*10)+temp;
			num=num/10;
			
		}
		System.out.println(sum);
	}


}
