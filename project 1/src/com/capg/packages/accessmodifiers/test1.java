package com.capg.packages.accessmodifiers;

public class test1 {
private int x=100;
private void display() {
	System.out.println("x="+x);
}
public static void main(String[] args) {
	test1 obj=new test1();
	obj.display();
}
}
