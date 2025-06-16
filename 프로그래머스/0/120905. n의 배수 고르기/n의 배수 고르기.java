class Solution {
    public int[] solution(int n, int[] numlist) {
            
        int count = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                count++;
            }
        }
        
        int[] arr = new int[count]; 
        
        int num = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                arr[num] = numlist[i];
                num++;
            }
        }
        return arr;
        
//         int[] answer = new int[numlist.length]; //먼저 answer 빈칸을 최대치로 늘리기
//         int cnt=0;
//         for(int i = 0 ; i < numlist.length; i++) {
//         	 if(numlist[i]%n==0) {
//         		answer[cnt]=numlist[i];
//         		cnt++; // 배수 갯수 카운트 
//         	 }
//         }
//         if(cnt < answer.length) {
//         	answer = Arrays.copyOf(answer, cnt); //Arrays.copyOf(기존, 늘리거나 줄이고 싶은 배열수)
//         }
//         return answer;
    }
}