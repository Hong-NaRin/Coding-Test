import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < attendance.length; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        int answer = 0;
      
        for(int i = 0; i < 3; i++) {
            int index = -1;
            for(int j = 0; j < rank.length; j++) {
                if(list.get(i) == rank[j]) {
                    index = j;
                    break;
                }
            }
            if(i == 0) answer += index * 10000;
            else if(i == 1) answer += index * 100;
            else if(i == 2) answer += index;
        }
      return answer;  
    }
}