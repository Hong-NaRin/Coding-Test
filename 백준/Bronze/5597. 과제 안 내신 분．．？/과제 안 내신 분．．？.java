import java.util.*;

public class Main{
	
    public static void main(String[] args) {
		
    	// 백준 - 과제 안 내신 분? 5597번
    	Scanner scan = new Scanner(System.in);
    	int[] arr = new int[31];
    	for(int i = 1; i <= 28; i++) {
    		int n = scan.nextInt();
    		arr[n] = 1;
    	}
    	for(int j = 1; j <= 30; j++) {
    		if(arr[j] == 0) {
    			System.out.println(j);
    		}        
    	}
    }
}