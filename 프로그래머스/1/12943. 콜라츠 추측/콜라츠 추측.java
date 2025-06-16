class Solution {
    public int solution(int num) {
        int cnt = 0;
        long number = num;
        while(number != 1 && cnt < 500) {
            if(number % 2 == 0) {
                number /= 2;
            }
            else {
                number = number*3 +1;
            }
            cnt++;
        }
        return cnt == 500 ? -1 : cnt;
    }
}