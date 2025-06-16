import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	// 백준 - 숫자카드2 10816번
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
       
        // 첫 번째 리스트: N개의 숫자 카드들
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
            // num이 map에 존재하지 않으면 0으로 기본값을 설정하고, 이미 존재하면 기존 값에 1을 더해
        }
        
        int M = scan.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = scan.nextInt();
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }
        
        System.out.println(sb.toString().trim());    	
    }
}