class Solution {
    public int solution(int[] num) {
        
        int number = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] < 0 ) {
                number = i;
                break;
            }
            else {
                number = -1;
            }
        }
        return number;
    }
}