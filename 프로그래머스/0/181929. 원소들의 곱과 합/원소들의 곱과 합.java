class Solution {
    public int solution(int[] num) {
        
        int sum = 0;
        int x = 1;
        int y = 0;
        int result = 0;
        
        for(int i = 0; i < num.length; i++) {
            x *= num[i];
            y += num[i]; 
            sum = y*y;
            
            if(x < sum) {
                result = 1;
            } 
            else {
                result = 0;
            }
        }
        return result;
    }
}