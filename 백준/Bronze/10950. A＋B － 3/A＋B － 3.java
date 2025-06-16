import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// 백준 - A+B-3 10950번
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a + b);
		}
    }
}