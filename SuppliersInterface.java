package com.mbdri;

import java.util.function.Supplier;

public class SuppliersInterface {
	public static void main(String[] args) {
	Supplier<Double> stringSupplier= ()->Math.random();
	
System.out.println(stringSupplier.get());	
		
		
	}

}
