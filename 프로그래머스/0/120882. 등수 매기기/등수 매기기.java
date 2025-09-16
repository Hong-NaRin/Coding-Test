import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] result = new double[score.length];
        int[] rank = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            int english = score[i][0];
            int math = score[i][1];
            
            result[i] = (english+math) / 2.0;
        } 
        
        for(int i = 0; i < score.length; i++) {
            int count = 1;
            for(int j = 0; j < score.length; j++) {
                if(result[i] < result[j]) { 
                    count++;
                }    
            }
            rank[i] = count;
        }
        return rank;
    }
}