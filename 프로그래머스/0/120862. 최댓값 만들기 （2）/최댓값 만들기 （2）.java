class Solution {
    public int solution(int[] numbers) {
        
        int answer = Integer.MIN_VALUE; // 초기값을 최소값으로 설정
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                int max = numbers[i] * numbers[j];
                if(max > answer) answer = max;    
            }
        }
        return answer;
    }
}