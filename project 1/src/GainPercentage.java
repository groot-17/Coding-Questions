import java.util.Scanner;

public class GainPercentage {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Price of Old Scooter: ");
	int cp=sc.nextInt();
	System.out.println("Amount Spent on repair");
	int repair=sc.nextInt();
	System.out.println("Sold price");
	int sp=sc.nextInt();
	if (cp<=0 || sp<=0) {
		System.out.println("Incorrect Inputs");
	}
	else if(cp+repair>sp) {
		System.out.println("Unable to calculate Gain Percentage");
	}
	else {
		float profit=sp-(cp+repair);
		float profitper=(profit/cp)*100;
		System.out.println("Gain percentage is: "+profitper);
	}
}
}
