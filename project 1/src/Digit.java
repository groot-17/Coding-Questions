import java.util.Scanner;

public class Digit {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int[] arr =new int[5];
	 char[] arr1=new char[5];
	 for(int i=0; i<4;i++) {
		 arr[i]=sc.nextInt();		 
	 }
	 for(int j=0;j<4;j++) {
		 arr1[j]=(char)arr[j];
	 }
	 for(int k=0;k<4;k++) {
		 System.out.println(arr[k]+"-"+arr1[k]);
	 }
	 
 }
}
