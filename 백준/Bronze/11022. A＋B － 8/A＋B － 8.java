import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 백준 - A+B-8 11022번
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 1; i <= T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
		}
    }
}