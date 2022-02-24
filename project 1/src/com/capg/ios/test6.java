package com.capg.ios;

import java.io.BufferedReader;
import java.io.FileReader;

public class test6 {
 public static void main(String[] args) throws Exception {
	 FileReader fr = new FileReader("capg.txt");
	 BufferedReader br = new BufferedReader(fr);
	 String c= br.readLine();
	 while(c!=null) {
		 System.out.println(c);
		 c=br.readLine();
	 }
	 br.close();
 }
}
