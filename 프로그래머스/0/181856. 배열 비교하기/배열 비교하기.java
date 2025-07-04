class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        for(int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        
        int sum2 = 0;
        for(int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        
        int answer = 0; 
        
        if(arr1.length > arr2.length) answer = 1;
        else if(arr1.length < arr2.length) answer = -1; 
        else {
            if(sum1 > sum2) answer = 1;
            else if(sum1 < sum2) answer = -1;
            else answer = 0;
        }
        return answer;
    }
}