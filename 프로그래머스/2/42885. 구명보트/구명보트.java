import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int first = 0; // 가볍고
        int last = people.length - 1; // 무거움
        int count = 0;
        
        while(first <= last) {
            if(people[first] + people[last] <= limit) {
                first++; // 가벼운 애 같이
            }
            last--; // 무거운 애는 항상 
            count++;
        }
        return count;
    }
}