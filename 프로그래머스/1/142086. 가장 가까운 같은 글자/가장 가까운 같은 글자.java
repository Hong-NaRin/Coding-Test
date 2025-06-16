import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> lastIdx = new HashMap<>();
        
        for(int i = 0; i < answer.length; i++) {
            if(lastIdx.containsKey(s.charAt(i))) {
                answer[i] = i - lastIdx.get(s.charAt(i));
            }
            else {
                answer[i] = -1;
            }
            lastIdx.put(s.charAt(i), i);
        }
        return answer;
    }
}