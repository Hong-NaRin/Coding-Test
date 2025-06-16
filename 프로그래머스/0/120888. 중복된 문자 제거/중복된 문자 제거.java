import java.util.*;
class Solution {
    public String solution(String my_string) {
        // String answer = "";
        // for(int i = 0; i < my_string.length(); i++) {
        //     if(my_string.indexOf(my_string.charAt(i)) == i)
        //         answer += my_string.charAt(i);
        // }
        // return answer;
        
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            } 
        }
        return sb.toString();
    }
}