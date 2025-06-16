class Solution {
    public int[] solution(int[] arr, int n) {
      
        for(int i = 0; i < arr.length; i++) {
            if(arr.length % 2 == 1) {
                if(i % 2 == 0) {
                    arr[i] = arr[i] + n;
                }
                else {
                    arr[i] = arr[i];
                }   
            }
            else {
                if(i % 2 == 1) {
                    arr[i] = arr[i] + n;
                }
                else {
                    arr[i] = arr[i];
                }   
            }
        }
        return arr;
    }
}