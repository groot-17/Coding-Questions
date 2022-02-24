import java.util.Scanner;

public class billGenrate {
	int pizza,puff,coldDrink;
 public void bill(){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.print("Enter no of pizza bought:");
	 pizza= sc.nextInt();
	 System.out.print("Enter no of pizza bought:");
	 puff= sc.nextInt();
	 System.out.print("Enter no of pizza bought:");
	 coldDrink= sc.nextInt();
 }
  public Double Calculate() {
  double bill=(100*pizza)+(20*puff)+(10*coldDrink);
  return bill;
  }
  public static void main(String[] args) {
	  billGenrate b1= new billGenrate();
	  b1.bill();
	  System.out.println("Bill Details\r\n"
	  		+ "No of pizzas:"+b1.pizza+"\r\n"
	  		+ "No of puffs:"+b1.puff+"\r\n"
	  		+ "No of cooldrinks:"+b1.coldDrink+"\r\n"
	  		+ "Total price="+b1.Calculate()+"\r\n"
	  		+ "ENJOY THE SHOW!!!\r\n");
	  
  }
  
}
