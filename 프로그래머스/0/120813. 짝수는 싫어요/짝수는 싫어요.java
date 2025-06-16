class Solution {
    public int[] solution(int n) {
     
    int[] arr = new int[n%2 ==0? n/2 : n/2 + 1];
     
       for(int i = 1; i <= n; i+=2) {
            if(i % 2 == 1) {
                 arr[i/2] = i;
            }
        }
        return arr;  
    }
}