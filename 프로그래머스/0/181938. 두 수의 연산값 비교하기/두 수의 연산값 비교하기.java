class Solution {
    public int solution(int a, int b) {
    
        if(Integer.parseInt(a+""+b) < 2*a*b) { // Integer.parseInt() - 정수를 문자열로 변환하고, 이어붙인 문자열을 다시 정수로 변환한다
            return 2*a*b;
        }
        else {
            return Integer.parseInt(a+""+b);
        }
    }
}