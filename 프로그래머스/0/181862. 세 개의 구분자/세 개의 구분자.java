class Solution {
    public String[] solution(String myStr) {
        
        String[] answer = myStr.replaceAll("[a-c]"," ").trim().split("\\s+"); 
        // split("\\s+") : 공백이 여러 개일 경우를 하나의 공백으로 간주하여 분리하는 것입니다.
      
        return answer[0].isEmpty() ? new String[]{"EMPTY"} : answer;
        // return answer[0].equals("") ? new String[]{"EMPTY"} : answer;
    }
}