import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 별찍기2 2439번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}