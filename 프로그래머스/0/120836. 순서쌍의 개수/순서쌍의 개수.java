class Solution {
    public int solution(int n) {
        int cnt = 0; 
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) cnt++;
        }        
        // int cnt = 0;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n; j++) {
        //         if(i * j == n) cnt++;
        //     }
        // }
        return cnt;
    }
}