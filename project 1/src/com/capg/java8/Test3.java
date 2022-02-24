package com.capg.java8;

import java.util.ArrayList;

public class Test3 {
	public static void main(String [] args) {
		ArrayList<Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product(1,"hplaptop",30000));
		productsList.add(new Product(2,"delllaptop",50000));
		productsList.add(new Product(3,"lenovolaptop",28000));
		productsList.add(new Product(4,"applelaptop",90000));
		productsList.add(new Product(5,"ausulaptop",40000));
		
		productsList.stream().filter(p->p.getPrice()==30000).forEach(p->System.out.println(p.getName()));
		
		}
}
