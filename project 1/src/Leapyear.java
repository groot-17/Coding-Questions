import java.util.Scanner;

public class Leapyear {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int year=sc.nextInt();
	 String temp=Integer.toString(year);
	// System.out.println(temp.length());
	 if (temp.length()>4 || temp.length()<0) 
		 System.out.println("Invalid Year Input ");
	 else if (year % 4 == 0) {
	      if (year % 100 == 0) {
	         if (year % 400 == 0)
	          System.out.println("Leap Year");
	         else
	          System.out.println("Not a Leap Year");
	      }
	      else
	        System.out.println("Leap Year");
	    }
	 else {
		 System.out.println("Not a laep Year");
	 }
	 
	 
 }
 }
