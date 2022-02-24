package com.capg.ios;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class test3 {
 public static void main(String[] args) throws Exception{
	 FileWriter fw = new FileWriter("capg.txt");
	 BufferedWriter bw= new BufferedWriter(fw);
	 bw.write("Vipin");
	 bw.newLine();
	 bw.write("Vivek");
	 bw.newLine();
	 bw.write("Yashraj");
	 bw.newLine();
	 bw.write(100);
	 System.out.println("Successfully Executed");
	 bw.close();
 }
}
