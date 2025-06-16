class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            answer = i + cnt; 
            while(answer % 3 == 0 || Integer.toString(answer).contains("3")) {
                cnt++;
                answer = i + cnt;
            }
        }
        return answer;
    }
}