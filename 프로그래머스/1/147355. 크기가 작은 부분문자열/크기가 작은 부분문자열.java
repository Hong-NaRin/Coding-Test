class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        Long p1 = Long.parseLong(p);
        for(int i = 0; i < t.length()-p.length()+1; i++) {
            if(Long.parseLong(t.substring(i, i+p.length())) <= p1) cnt++;
        }
        return cnt;
    }
}