import java.util.*;
class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        
        for(int num : array) {
            count[num]++;
        }
        
        int max = 0;
        int answer = 0;
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                answer = i;
            } 
            else if(count[i] == max && max != 0)
                answer = -1;
        }        
        return answer;
    }
}