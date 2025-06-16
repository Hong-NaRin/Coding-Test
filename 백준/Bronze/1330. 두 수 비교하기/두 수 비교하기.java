import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 조건문 1330번
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}
		else if(a == b) {
			System.out.println("==");
		}
		else {
			System.out.println("<");
		}
    }
}  