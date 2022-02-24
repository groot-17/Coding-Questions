package com.capg.ios;

import java.io.FileReader;

public class test5 {
 public static void main(String[] args) throws Exception {
	 FileReader fr= new FileReader("capg.txt");
	 
	 
	 int x= fr.read();
	  while(x!=-1) {
		  System.out.print((char)x);
		  x=fr.read();
	  }
 }
}
