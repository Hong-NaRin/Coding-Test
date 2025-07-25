import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
               while(n % i == 0) {
                   n /= i;
               }
               list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}