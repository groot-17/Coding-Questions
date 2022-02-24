package com.capg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {
	
public static  void main(String[] args) {
	ArrayList<Integer> l = new ArrayList<Integer>();
	for (int i=0;i<=10;i++) {
		l.add(i);
	}
	List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l2);
}
}
