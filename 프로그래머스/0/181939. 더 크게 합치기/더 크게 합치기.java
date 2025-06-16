class Solution {
    public int solution(int a, int b) {
        int result = 0;
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(ab > ba) {
            result = ab;
        }
        else {
            result = ba;
        }
        return result; 
    }
}