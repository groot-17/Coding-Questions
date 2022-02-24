package com.capg.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private static Calculator obj= null;
	
	@BeforeAll
	public static void init() {
		obj= new Calculator();
	}
	
	@AfterAll
	public static void destory() {
		obj =null;
	}
	

	@Test
	void testAdd() {
		int originalResult = obj.sum(10,30);
		int expectedResult = 40;	
		
		assertEquals( expectedResult,originalResult);
	}
	
	@Test
	void testMul() {
		int originalResult = obj.mul(10,30);
		int expectedResult = 300;	
		
		assertEquals( expectedResult,originalResult);
	}

}
