import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[9][9];
		
		int r = 0;
		int c = 0;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {  // 행 반복
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
				
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
				
				if(max == arr[i][j]) {
					r = i+1;
					c = j+1;
				}	
			}
		}
		
		System.out.println(max);
		System.out.println(r + " " + c);
		
	
	}
}
