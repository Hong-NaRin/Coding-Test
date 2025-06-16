class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0;
        int[] answer = new int[num_list.length];
        // n부터 끝까지 저장
        for(int i = n; i < num_list.length; i++) {
            answer[cnt++] = num_list[i];    
        }
        // 0부터 n까지 저장
        for(int i = 0; i < n; i++) {
            answer[cnt++] = num_list[i];    
        }
        return answer;
    }
}