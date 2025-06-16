import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 백준 - 검증수 2475번
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			sum += (num*num);
		}
		System.out.println(sum%10);
    }
}