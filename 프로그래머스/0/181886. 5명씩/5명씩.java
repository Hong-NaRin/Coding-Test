import java.util.*;
class Solution {
    public String[] solution(String[] names) {
//         List<String> list = new ArrayList<>();
//         for(int i = 0; i < names.length; i++) {
//             if(i % 5 == 0)  list.add(names[i]);
//         }
//         return list.toArray(new String[list.size()]);
        int cnt = 0;
        String[] answer = {};
        if(names.length % 5 == 0) 
            answer = new String[names.length / 5];
        else 
            answer = new String[names.length / 5 + 1];
        
        for(int i = 0; i < names.length; i+=5) {
            answer[cnt] = names[i];
            cnt++;
        }
        return answer;
    }
}