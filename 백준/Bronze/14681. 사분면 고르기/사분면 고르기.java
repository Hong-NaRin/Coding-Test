import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		// 백준 - 조건문 14681번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		if( a >= 1 && b >= 1) {
			System.out.println("1");
		}
		else if(a <= -1 && b >= 1 ) {
			System.out.println("2");
		}
		else if(a <= -1 && b <= -1) {
			System.out.println("3");
		}
		else if(a >= 1 && b <= -1) {
			System.out.println("4");
		}
		else {
			System.out.println();
		}	
    }
}