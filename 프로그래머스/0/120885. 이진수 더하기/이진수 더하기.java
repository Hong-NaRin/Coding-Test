class Solution {
    public String solution(String bin1, String bin2) {
        
        // Integer.parseInt(String s,int n);  -> n진수를 10진수로 변환
        // Integer.toBinaryString(int i); -> 10진수를 2진수로 변환

        int num1 = Integer.parseInt(bin1, 2); // 2진수인 문자열을 10진수로 변환시킨다
        int num2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(num1+num2);  // 두 문자열을 10진수로 변환하여 합한 값을 2진수로 변환한다
    }
}