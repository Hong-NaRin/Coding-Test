class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+"); 
        // 정규식 표현 \\s+는 중간 공백이 1개 이상인 데이터를 잘라냄
        return answer;
    }
}