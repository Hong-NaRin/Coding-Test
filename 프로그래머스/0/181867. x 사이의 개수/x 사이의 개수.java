class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", myString.length()); // split(x를 기준으로 분리하고, 분리할 최대 개수 지정) 
        int[] answer = new int[str.length];
            
        for(int i = 0; i < answer.length; i++) {
            answer[i] = str[i].length();  
        }
        return answer;
    }
}