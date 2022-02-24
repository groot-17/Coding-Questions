package com.capg.java8;

import java.util.ArrayList;

public class Test1 {
	public static void main(String [] args) {
	ArrayList<Product> productsList = new ArrayList<Product>();
	
	productsList.add(new Product(1,"hplaptop",30000));
	productsList.add(new Product(2,"delllaptop",50000));
	productsList.add(new Product(3,"lenovolaptop",28000));
	productsList.add(new Product(4,"applelaptop",90000));
	productsList.add(new Product(5,"ausulaptop",40000));
	
	ArrayList<Double> productprice= new ArrayList<Double>();
	
	for(Product p1: productsList) {
		if(p1.getPrice()>40000) {
			productprice.add(p1.getPrice());
			
		}
		
	}
	System.out.println(productprice);
	}
}
