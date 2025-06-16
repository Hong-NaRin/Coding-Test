import java.util.*;
class Solution {
    public int[] solution(String my_string) {
         my_string = my_string.replaceAll("[a-zA-Z]", ""); // 대소문자 모두 제거
        String[] str = my_string.split("");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(answer); // 정렬만 수행
        return answer;       // 정렬된 배열 반환
    }
}