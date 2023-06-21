package com.practice;

import java.util.ArrayList;

public class PrimeNo {
	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		for(int i=2;i<=30;i++) {
			int flag=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if (flag==1) {
				System.out.println(i);
			}
			
		}
}
}
			
	


