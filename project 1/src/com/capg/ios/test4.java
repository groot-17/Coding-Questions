package com.capg.ios;

import java.io.PrintWriter;

public class test4 {
 public static void main(String[] args) throws Exception{
	 PrintWriter pw = new PrintWriter("capg.txt");
	  
	 pw.println("Vipin");
	 pw.println("Vivek");
	 pw.println("Yashraj");
	 pw.print(100);
	 
	 System.out.println("Successfully Execeuted");
	 pw.close();
 }
}
