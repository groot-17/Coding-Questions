package com.capg.ios;

import java.io.FileWriter;

public class test2 {
 public static void main(String[] args) throws Exception{
	 FileWriter fw = new FileWriter("capg.txt");
	 
	 fw.write("Vipin");
	 fw.write("Vivek");
	 fw.write("Yashraj");
	 fw.write(100);
	 
	 System.out.println("Data written Successfully!!!");
	 fw.close();
 }
}
