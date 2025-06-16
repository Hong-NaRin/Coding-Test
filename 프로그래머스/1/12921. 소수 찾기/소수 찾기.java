class Solution {
    public int solution(int n) {
        boolean[] isDecimal = new boolean[n + 1];
        
        // 2 이상 n 이하의 모든 숫자를 소수로 간주하여 초기화
        for (int i = 2; i <= n; i++) {
            isDecimal[i] = true;
        }
        
        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= n; i++) {
            if (isDecimal[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isDecimal[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isDecimal[i]) {
                count++;
            }
        }
        
        return count;
    }
}