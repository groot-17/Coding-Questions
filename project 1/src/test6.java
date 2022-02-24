
public class test6 {
 private int x;
 private String name;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void main(String[] args) {
	test6 obj=new test6();
	obj.setX(30);
	System.out.println(obj.getX());
	
}
}
