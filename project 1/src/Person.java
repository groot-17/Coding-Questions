
public class Person {
	

    	private String name;
    	private  int age;
    	private char gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
    	
		public  static void equals(Person obj1 ,Person obj2) {
			if((obj1.getName()==obj2.getName()) && (obj1.getAge()==obj2.getAge())  && (obj1.getGender()==obj2.getGender()) ) {
				System.out.println("Same");
			}
			else
				System.out.println("Different");
			
		}
	
}
	


