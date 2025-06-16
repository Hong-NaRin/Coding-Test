import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	// 백준 - 좌표정렬하기 11650번
    	
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
    	int[][] arr = new int[N][2];
    	
    	for(int i = 0; i < N; i++) {
    		arr[i][0] = scan.nextInt();
    		arr[i][1] = scan.nextInt();
    	}
    	
    	Arrays.sort(arr, (e1, e2) -> {
    		if(e1[0] == e2[0]) {
    			return e1[1] - e2[1];
    		}
    		else {
    			return e1[0] - e2[0];
    		}
    	});
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < N; i++) {
    		sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
    	}
    	System.out.println(sb);
    }
}