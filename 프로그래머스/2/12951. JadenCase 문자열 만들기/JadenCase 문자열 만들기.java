class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        boolean isStart = true;
        
        for(char c : s.toCharArray()) {
            if(isStart) { // 단어 첫 글자
                sb.append(Character.toUpperCase(c));             
            }
            else { // 단어 나머지 부분
                sb.append(Character.toLowerCase(c));
            }
            isStart = (c == ' '); // 공백일 때 다음 단어의 시작
        }
        return sb.toString();
    }
}