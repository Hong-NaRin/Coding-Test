import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int mid = 0;
        Arrays.sort(array);
        
        mid = array[array.length/2];
        return mid;
    }
}