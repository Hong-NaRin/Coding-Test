class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] array = s.split(""); 

        for (int i = 0; i < array.length; i++) { 
            // idx = array[i].contains(" ") ? 0 : idx + 1;
            if (array[i].contains(" ")) { 
                idx = 0; // 단어 인덱스 초기화
            } else {
                idx++; 
            }
            // 현재 문자를 대소문자 변환하여 answer에 추가
            answer += (idx % 2 == 0) ? array[i].toLowerCase() : array[i].toUpperCase();
        }

        return answer;
    }
}