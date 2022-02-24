import java.util.*;
public class Employee {
 int empId=101;
 String empName="Vipin";
 double empSalary=30000;
 public void print() {
	 System.out.println("Employee id="+empId);
	 System.out.println("Employee Name="+empName);
	 System.out.println("Employee monthly Salary="+empSalary);
	 
 }
 public double anualSalary() {
	 return (empSalary*12);
 }
 public static void main(String[] args) {
	 Employee obj=new Employee();
	 obj.print();
	 System.out.println("Anual Salary="+obj.anualSalary());
 }

 
 
}
