import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		 Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     
	     String num2 = Integer.toString(b);
	     
	     
	     for(int i = 2; i >= 0; i--) {
	    	 System.out.println(a * (num2.charAt(i)-'0'));
	     }
	     System.out.println(a*b);
    }
}