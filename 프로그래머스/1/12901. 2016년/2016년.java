class Solution {
    public String solution(int a, int b) {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int date = 0;
        // 1월부터 a-1월까지의 일수 계산
        for (int i = 0; i < a - 1; i++) {
            date += month[i];
        }
        // b일 추가
        date += b - 1;

        // 요일 계산 - 금요일이 5번째 인덱스이므로 오프셋 5를 더함
        return day[(date + 5) % 7];
    }
}