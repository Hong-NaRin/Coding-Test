class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int[] answer = new int[sum];
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        return answer;
    }
}