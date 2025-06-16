class Solution {
    public int solution(int n) {
        
        int result = 2;
        for(int i = 1; i <= n; i++) {
            if(i * i == n) result = 1;
        }
      return result;
        
//      int answer = 2;
        
//      if(Math.sqrt(n) % 1 == 0){
//          answer = 1;
//      }  
//      return answer;  
    } 
}