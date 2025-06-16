import java.util.*;

public class Main{
	
    public static void main(String[] args) {
		// 백준 - 바구니 뒤집기 10811번
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
    	int M = scan.nextInt();
    	int[] arr = new int[N];
    	for(int a = 0; a < N; a++) {
    		arr[a] = a+1;
    	}
    	for(int a = 0; a < M; a++) {
    		int i = scan.nextInt()-1;
    		int j = scan.nextInt()-1;
    		
    		while(i<j) {
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    			i++;
    			j--;
    			
    		}
    	}
    	for(int a = 0; a < N; a++) {
    		System.out.print(arr[a] + " ");
    	}
    }
}