import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 공 넣기 10810번
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for(int a = 0; a < M; a++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
			for(int b = i-1; b < j; b++) {
				arr[b] = k;
			}
		}
		for(int c = 0; c < N; c++) {
			System.out.print(arr[c] + " ");				
		}
    }
}