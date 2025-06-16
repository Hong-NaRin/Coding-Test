import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 백준 - 개수세기 10807번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int v = scan.nextInt();
	
		for(int j =0 ; j < n; j++) {
			if(v == arr[j]) {	
				cnt++;
			}
		}
		System.out.println(cnt);
    }
}