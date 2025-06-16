class Solution {
    public String solution(String letter) {
        String[] morse = { 
     ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
    "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",  "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String answer = "";
        String[] str = letter.split(" ");
        
        for(int i = 0; i < str.length; i++) { // 배열화 시킨 for&for로 넣어준다 (보통 문자열을 찾는 경우 for&for를 사용한다)
            for(int j = 0; j < morse.length; j++) {
                 if(str[i].equals(morse[j])) { 
                     answer += Character.toString( j + 'a');
                 }
            }
        }
        return answer;
    }
}