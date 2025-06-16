class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) cnt++;
        }
        int[] arr = new int[cnt];
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) arr[index++] = i;
        }

        return arr;
    }
}