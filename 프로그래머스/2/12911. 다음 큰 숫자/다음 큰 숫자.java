class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n); // n의 2진수 1의 개수
        int next = n + 1;
        
        while (true) {
            if(Integer.bitCount(next) == count) {
                return next;
            }
            next++;
        }
    }
}