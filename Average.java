package com.practice.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> l1= new ArrayList<>();
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			
			l1.add(scanner.nextInt());
			
		}
		int sum=l1.stream().reduce(0,(a,b)->a+b);
		double avg = sum/n;
		System.out.println(avg);
	}

}
