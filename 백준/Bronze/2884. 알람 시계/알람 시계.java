import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 조건문 2884번
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(h == 0) {
			if(m-45 < 0) {
				System.out.println(23 + " " + (m+15));
			}
			else {
				System.out.println(h + " " + (m-45));
			}
		}
		else if(m-45 < 0) {
			System.out.println((h-1) + " " + (m+15));
		}
		else {
			System.out.println(h + " " + (m-45));		
		}
    }
}