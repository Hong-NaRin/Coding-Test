import java.util.*;

public class Main{
	
    public static void main(String[] args) {
		
		// 백준 - 공 바꾸기 10813번
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];

		for(int a = 0; a < arr.length; a++) {
			arr[a] = a+1;
		}
		for(int M = 0; M < m; M++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			int temp=arr[i-1];
			arr[i-1]=arr[j-1];
			arr[j-1]=temp;
		}
		for(int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		scan.close();
    }
}