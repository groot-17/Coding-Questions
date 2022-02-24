package com.capg.java8;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Test2 {
	public static void main(String [] args) {
		ArrayList<Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product(1,"hplaptop",30000));
		productsList.add(new Product(2,"delllaptop",50000));
		productsList.add(new Product(3,"lenovolaptop",28000));
		productsList.add(new Product(4,"applelaptop",90000));
		productsList.add(new Product(5,"ausulaptop",40000));
		
		List<Double> productPrice= productsList.stream().filter(p->p.getPrice()==50000).map(p->p.getPrice()).collect(Collectors.toList());
		System.out.println(productPrice);
		
	}
}
	
