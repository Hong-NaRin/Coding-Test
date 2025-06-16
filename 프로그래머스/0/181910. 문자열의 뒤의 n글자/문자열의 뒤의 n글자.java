class Solution {
    public String solution(String str, int n) {
        return str.substring(str.length()-n); // 끝에서 n번째를 시작으로 문자열의 끝까지 반환
        // str.substring(int beginIndex);
    }
}