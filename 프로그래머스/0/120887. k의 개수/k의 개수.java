class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        for(int start = i; start <= j; start++) {
            str += start+"";
        }
        return str.length() - str.replace(k+"", "").length();
        // str.replace(k+"", "")는 str에서 k에 해당하는 문자열을 모두 빈 문자열로 대체한 결과를 반환
        // 원래 문자열의 길이에서 k가 제거된 문자열의 길이를 빼면 = k의 등장 횟수
    }
}