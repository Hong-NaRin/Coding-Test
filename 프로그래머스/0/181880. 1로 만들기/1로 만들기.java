class Solution {
    public int solution(int[] num) {
        int cnt = 0;
        for(int i = 0; i < num.length; i++) {
            while ( num[i] != 1 ) {
                if(num[i] % 2 == 0) {
                     num[i] = num[i] / 2;
                     cnt++;
                }
                else if(num[i] % 2 != 0) {
                     num[i] = (num[i] - 1) / 2;
                     cnt++;
                }   
            }
        }
        return cnt;
    }
}