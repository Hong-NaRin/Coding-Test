import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	// 백준 - 제로 10773번 (Sanner와 stack 활용)
    	Scanner scan = new Scanner(System.in);
    	Stack<Integer> stack = new Stack<>();
    	
    	int K = scan.nextInt();
    	for(int i = 0; i < K; i++) {
    		int a = scan.nextInt();
    		if(a == 0) stack.pop();
    		else stack.push(a);
    	}
    	int sum = 0;
    	for(int i = 0; i < stack.size(); i++) {
    		sum += stack.get(i);
    	}
    	System.out.println(sum);
    }
}