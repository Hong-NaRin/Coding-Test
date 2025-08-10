class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int num = i; num <= n; num++){
                sum += num;
                if(sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}