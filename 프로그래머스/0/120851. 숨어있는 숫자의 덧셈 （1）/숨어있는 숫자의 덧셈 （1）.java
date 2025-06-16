class Solution {
    public int solution(String str) {
        
        String[] arr = str.replaceAll("[a-zA-Z]", "").split("");
      
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
        
        // int sum = 0;
        // for(int i = 0; i < str.length(); i++) {
        //     char s = str.charAt(i); 
        //     if(Character.isDigit(s)) { // Character.isDigit(x) x값이 문자인지 digit(숫자)인지 확인
        //         sum += s-'0'; // s값이 숫자인 경우 0을 빼주면 숫자값으로 변환
        //     }
        // }
        // return sum;        
    }
    
}