import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Person obj1 = new Person();
	  Person obj2 = new Person();
	  Scanner sc= new Scanner(System.in);
	  obj1.setName(sc.next());
	  obj1.setAge(sc.nextInt());
	  obj1.setGender(sc.next().charAt(0));
	  obj2.setName(sc.next());
	  obj2.setAge(sc.nextInt());
	  obj2.setGender(sc.next().charAt(0));
	  Person.equals(obj1, obj2);
  }
}