import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 최소, 최대 10818번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int min = 1000000;
		int max = -1000000;
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
    }
}