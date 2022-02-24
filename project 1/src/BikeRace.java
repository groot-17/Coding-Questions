import java.util.*;
public class BikeRace {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance travelled:");
		int distance = sc.nextInt();
		int oddProduct = 1, evenProduct = 1;
		while(distance>0) {
			
			
			int e = distance %10;
			int o = distance%100;
			int o1 = o/10;
			
			distance = distance/100;
			
			evenProduct *= e;
			oddProduct *= o1;
			
			
		}
		System.out.println(oddProduct);
		System.out.println(evenProduct);
		if(oddProduct>evenProduct) {
			System.out.println("Your bonus points are :" + oddProduct);
			//System.out.println("if block");
		}
		else if(oddProduct == evenProduct) {
			System.out.println("Your bonus points are :" + 2*oddProduct);
		}
		else {
			System.out.println("Your bonus points are : " + evenProduct);
			//System.out.println("else block");
		}
		}
}
		
