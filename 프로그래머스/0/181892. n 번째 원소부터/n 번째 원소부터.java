class Solution {
    public int[] solution(int[] num, int n) {
        int[] arr = new int[num.length-n+1];
        
        for(int i = 0; i < arr.length; i++) {
             arr[i] = num[i+n-1];
        }
        return arr;
    }
}