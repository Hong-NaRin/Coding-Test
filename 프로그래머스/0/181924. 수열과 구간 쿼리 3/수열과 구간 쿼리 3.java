class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            int temp = answer[s];
            answer[s] = answer[e];
            answer[e] = temp;   
        }
        return answer;
    }
}