class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        int cnt = 0;
        for(int i = answer.length-1; i >= 0; i--) {
            // answer[cnt] = Integer.parseInt(String.valueOf(s.charAt(i)));
            answer[cnt] = s.charAt(i) - '0';
            cnt++;
        }
        return answer;
    }
}