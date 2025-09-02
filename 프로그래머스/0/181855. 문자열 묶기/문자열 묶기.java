import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        int[] count = new int[31];
        
        for(int i = 0; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) max = count[i];
        }
        
        return max;
    }
}