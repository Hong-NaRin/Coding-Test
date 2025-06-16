class Solution {
    public int solution(int n) {
        int sum = 0;
        int x = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                x += i*i;
            }    
            else {
                sum += i;
            }
        }
        return n % 2 == 0 ? x : sum;
    }
}