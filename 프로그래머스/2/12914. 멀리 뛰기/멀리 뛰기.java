class Solution {
    public long solution(int n) {
        int mod = 1234567;
        long a = 1;
        long b = 1;
        
        for(int i = 2; i <= n; i++) {
            long temp = (a+b) % mod;
            a = b;
            b = temp;
        }
        
        return b;
    }
}