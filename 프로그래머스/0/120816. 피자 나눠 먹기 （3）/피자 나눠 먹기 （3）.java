class Solution {
    public int solution(int slice, int n) {
        int cnt = n / slice ;
        return n % slice == 0? cnt : cnt + 1 ;
    }
}