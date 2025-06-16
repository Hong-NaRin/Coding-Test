class Solution {
    public static void main(String[] args) {
        
    }
    public int solution(int[] array, int height) {
        
       int cnt = 0; 
       for(int arr : array) {
           if(height < arr) {
               cnt++;
           }
       } 
        return cnt;
    }
}