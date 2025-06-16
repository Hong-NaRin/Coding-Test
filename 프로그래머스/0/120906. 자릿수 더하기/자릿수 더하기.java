class Solution {
    public int solution(int n) {
        // int answer = 0;
        // String[] arr = Integer.toString(n).split("");
        // for(String s : arr){
        //     answer += Integer.parseInt(s);
        // }
        // return answer;
        
        int answer = 0;
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}