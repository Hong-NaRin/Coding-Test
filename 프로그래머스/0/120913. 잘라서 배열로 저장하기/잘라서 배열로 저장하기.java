class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()%n == 0? my_str.length()/n : my_str.length()/n + 1];
        
        int cnt = 0;
        for(int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }
        for(int i = 0; i < my_str.length(); i++) {
            answer[cnt] += my_str.charAt(i);
                if(i % n == (n-1)) cnt++;
        }
        return answer;
        
        // for(int i = 0; i < answer.length; i++) {
        //     if(my_str.length() > n) {
        //         answer[i] = my_str.substring(0, n);
        //         my_str = my_str.substring(n, my_str.length());
        //     }
        //     else {
        //         answer[i] = my_str.substring(0, my_str.length());
        //     }
        // }
        // return answer;
    }
}