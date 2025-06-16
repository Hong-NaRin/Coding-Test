import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int change = -100;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != change) {
                list.add(arr[i]);
                change = arr[i];
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}