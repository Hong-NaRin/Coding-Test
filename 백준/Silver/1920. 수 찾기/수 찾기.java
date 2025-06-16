import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
        
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
        // 첫 번째 리스트의 숫자들을 입력받아 map에 추가
    	for(int i = 0; i < N; i++) {
    		int a = scan.nextInt();
    		map.put(a, 1); // a라는 숫자를 map에 키로 추가하고, 값을 1로 설정
    	}
    	
    	int M = scan.nextInt();
    	StringBuilder sb = new StringBuilder();
    	
    	 // 두 번째 리스트의 각 숫자 b가 첫 번째 리스트에 있는지 확인
    	for(int i = 0; i < M; i++) {
    		int b = scan.nextInt();
    		if(map.getOrDefault(b, 0) == 1) {
    			sb.append(1).append('\n'); // 숫자 b가 첫 번째 리스트에 있으면 1
    		}
    		else {
    			sb.append(0).append('\n'); // 숫자 b가 첫 번째 리스트에 없으면 0
    		}
    	}
    	System.out.println(sb.toString());
    }
}