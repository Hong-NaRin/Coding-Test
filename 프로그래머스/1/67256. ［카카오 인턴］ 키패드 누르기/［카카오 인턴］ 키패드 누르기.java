class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left_location = 10;
        int right_location = 12;
            
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R"; 
                right_location = numbers[i];
            }
            else if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left_location = numbers[i];
            }
            else {
                // 숫자가 0인 경우 키패드 위치를 11로 변환
                if(numbers[i] == 0) numbers[i] = 11;

                // 왼손과의 거리와 오른손과의 거리를 계산
                int leftDist = Math.abs(numbers[i] - left_location) / 3 + Math.abs(numbers[i] - left_location) % 3;
                int rightDist = Math.abs(numbers[i] - right_location) / 3 + Math.abs(numbers[i] - right_location) % 3;
                if(leftDist < rightDist) {
                    answer += "L";
                    left_location = numbers[i];
                }
                else if(leftDist > rightDist) {
                    answer += "R";
                    right_location = numbers[i];
                }
                else {
                    // 왼손잡이인 경우
                    if (hand.equals("left")) {
                        answer += "L";
                        left_location = numbers[i];
                    // 오른손잡이인 경우
                    } 
                    else {
                        answer += "R";
                        right_location = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}