package com.acpg.Exception;

public class test2 {
	public void checkProduct(int weight)
	 {
		 if(weight > 100)
		 {
			 System.out.println("product is valid");
		 }
		 else
		 {
			  try {
			 throw new InvalidProductException();
			  }
			  catch(InvalidProductException ie)
			  {
				  System.out.println("product weight must be greater than 100kgs");
			  }
		 }
	 }
	 
	 
	 

}
