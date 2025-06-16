class Solution {
    public int solution(int[] numbers, int k) {
        return ((k-1)*2) % numbers.length + 1;
        // return numbers[ ((k-1) * 2) % numbers.length ];
        // 한명을 건너띄고 던지므로 인덱스는 2 증가하고, 첫번째에 공을 던지는 것은 항상 0번 인덱스이므로 (k-1) 이다.
        
     // int answer = 1;
     // for(int i=1; i<k; i++) {
     //       answer+=2;   //다음다음 사람한테 공을 던짐
     //       if(answer>numbers.length) {  //만약 answer가 서있는 사람들의 수보다 커지면
     //             answer-=numbers.length;  //사람들의 수만큼 다시 빼줌
     //        }
     // }
     // return answer;
    }
}