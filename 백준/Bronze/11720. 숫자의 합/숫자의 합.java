import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 숫자의 합 11720번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		String [] arr = str.split("");
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.print(sum);
    }
}