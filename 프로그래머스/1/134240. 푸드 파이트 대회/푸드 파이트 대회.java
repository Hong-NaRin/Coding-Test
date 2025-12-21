import java.util.*;

class Solution {
    public String solution(int[] food) {
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            int count = food[i]/2;
            for(int j = 0; j < count; j++) {
                answer.append(i);
            }
        }
        
        StringBuilder result = new StringBuilder();
        result.append(answer);
        result.append("0");
        result.append(answer.reverse());
        
        return result.toString();
    }
}