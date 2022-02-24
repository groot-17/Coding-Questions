package com.capg.ios;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//this program is on deserialization
public class Test8 {

	
	public static void main(String[] args) throws Exception{
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		Student student = (Student)ois.readObject();
		
		System.out.println(student);
		ois.close();
	}
}
