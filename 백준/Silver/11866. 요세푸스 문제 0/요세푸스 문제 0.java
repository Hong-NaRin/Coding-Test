import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	// 백준 - 요세푸스 문제 11866번
    	Scanner scan = new Scanner(System.in);
    	Queue<Integer> queue = new LinkedList<>();
    	
    	int N = scan.nextInt();
    	int K = scan.nextInt();
    	
    	for(int i = 1; i <= N; i++) {
    		queue.add(i);
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append('<');
    	
    	while(queue.size() > 1) {
    		for(int i = 0; i < K-1; i++) {
    			int val = queue.poll();
    			queue.offer(val);
    		}
    		sb.append(queue.poll()).append(", ");
    	}
    	// 마지막 원소 출력한 뒤 > 도 붙여준다.
    	sb.append(queue.poll()).append('>');
    	System.out.println(sb);
    }
}