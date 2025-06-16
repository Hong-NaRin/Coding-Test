class Solution {
    public int solution(int n, int t) {
        
        int answer = n;
        for(int j = 1; j <= t; j++) {
            answer *= 2;
        }
        
        return answer;
    }
}