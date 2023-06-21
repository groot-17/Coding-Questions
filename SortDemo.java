package com.practice.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SortDemo {
	public static void main(String[] args) {
	int arr[]={2,5,78,4,1};
	 
	  int max = Arrays.stream(arr).max().getAsInt();	  
	  System.out.println(max);
	}

}
