import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 - X보다 작은 수 10871번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int[] arr = new int[n];
		
 		for( int i = 0; i < arr.length; i++ ) {
 			arr[i] = scan.nextInt();
 			if(arr[i] < x) {
 				System.out.print(arr[i] + " "); 				
 			}
		}
    }
}