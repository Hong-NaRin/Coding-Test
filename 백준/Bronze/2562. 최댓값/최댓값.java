import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - 최댓값 2562번
		Scanner scan = new Scanner(System.in);		
		int[] arr = new int[9];
		int max = 0;
		int maxnumber = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = scan.nextInt();
			if(max < arr[i]) {
				max = arr[i]; 
				maxnumber = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxnumber);
    }
}