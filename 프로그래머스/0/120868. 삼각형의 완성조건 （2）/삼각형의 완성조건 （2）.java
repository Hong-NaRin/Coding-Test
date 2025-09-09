import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        
        // max가 가장 긴 변일 경우 
        for(int i = max - min + 1; i <= max; i++ ) {
            answer++;
        }
        // 나머지 변이 가장 긴 변일 경우 
        for(int i = max + 1; i < max + min; i++) {
            answer++;
        }
        return answer;
    }
}