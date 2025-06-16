class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(); 
        String s = Integer.toString(n, 3);
        String rs = sb.append(s).reverse().toString();
        int answer = Integer.parseInt(rs, 3);
        return answer;
    }
}