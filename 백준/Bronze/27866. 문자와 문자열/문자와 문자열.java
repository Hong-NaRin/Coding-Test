import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int i = scan.nextInt();
			
		char a = s.charAt(i-1);
		System.out.println(a);
    }
}