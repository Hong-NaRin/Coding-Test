class Solution {
    public int solution(String num_str) {
        String[] str = num_str.split("");
        int sum = 0;
        for(int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
            
            // for(int i = 0; i < num_str.length(); i++) {
            // sum += num_str.charAt(i)-'0';
        }
        return sum;
    }
}