package com.capg.ios;
import java.io.File;


public class test1 {
 public static void main(String[] args) throws Exception {
	 File f = new File("capg.txt");
	 f.createNewFile();
	 System.out.println(f.exists());
 }
}
