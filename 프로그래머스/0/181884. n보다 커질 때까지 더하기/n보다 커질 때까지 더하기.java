class Solution {
    public int solution(int[] num, int n) {
        
        int result = 0;
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += num[i];
            if(sum > n) {
                result = sum;
                break;
            }
        }        
        return result;
    }
}