class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    private int lcm (int a, int b) { // 최소공배수
        return a * b / gcd(a,b);
    }

    private int gcd(int a, int b) { // 최소공약수
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}