import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 별찍기1 2438번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) { // 행
			for(int j = 1; j <= i; j++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
    }
}