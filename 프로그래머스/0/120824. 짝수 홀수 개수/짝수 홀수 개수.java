class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 1;
        int odd = 1;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0 ) {
                answer[0] = even++;
            } 
            else {
                answer[1] = odd++;
            }
        }
        return answer;
    }
}