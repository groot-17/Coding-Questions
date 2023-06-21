package com.practice.example;

public class Exception {
	public static void main(String[] args) {
		try {
			int a = 10/0;
		}
        catch (ArithmeticException e) {
			System.out.println("Inside subclass exception catch block");
			System.exit(0);
		}
		finally {
			System.out.println("Finally Block");
		}
	}
}