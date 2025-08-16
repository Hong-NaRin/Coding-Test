import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        int max = 0;
        for (int w : works) {
            if (w > max) max = w;
        }
        
        int[] count = new int[max + 1];
        for (int w : works) {
            count[w]++;
        }
        
        // 큰 값부터 줄이기
        for (int i = max; i > 0 && n > 0; i--) {
            while (count[i] > 0 && n > 0) {
                count[i]--;
                count[i - 1]++;
                n--;
            }
        }
        
        // 제곱 합 계산
        long answer = 0;
        for (int i = 1; i <= max; i++) {
            answer += (long) i * i * count[i];
        }
        
        return answer;
    }
}