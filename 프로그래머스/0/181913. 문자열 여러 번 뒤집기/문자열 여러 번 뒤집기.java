import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            String sub = sb.substring(s, e+1);
            StringBuilder reversed = new StringBuilder(sub).reverse();
            
            sb.replace(s, e+1, reversed.toString());
        }
        return sb.toString();
        
           // 2번째 방법
//         String answer = my_string;
        
//         for(int i = 0; i < queries.length; i++) {
//             int s = queries[i][0];
//             int e = queries[i][1];
            
//             String start = answer.substring(0, s);
//             String sub = answer.substring(s, e+1);
//             String end = answer.substring(e+1);
            
//             String reverse = "";
//             for(int j = sub.length()-1; j >= 0; j--) {
//                 reverse += sub.charAt(j);
//             }
//             answer = start + reverse + end;
//         }
//         return answer;
    }
}