class Solution {
    public int solution(int n, int k) {
        int food = 12000;
        int drink = 2000;
        int cnt = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % 10 == 0) {
                cnt++;
             }           
        }
        int result = (food*n) + (drink*(k-cnt));
        return result;
    }
}