import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        // int[] answer = new int[num2 - num1 + 1];
        // int cnt = 0;
        // for(int i = num1; i <= num2; i++) {
        //     answer[cnt++] = numbers[i];
        // }
        return answer;
    }
}