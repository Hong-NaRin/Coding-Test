import java.util.*;
class Solution {
    public int solution(String before, String after) {
 
        char[] ch = before.toCharArray();
        char[] ch2 = after.toCharArray();
        
        Arrays.sort(ch);
        Arrays.sort(ch2);
        
        String arr1 = new String(ch);
        String arr2 = new String(ch2);
        
        return arr1.equals(arr2) ? 1 : 0;
    }
}