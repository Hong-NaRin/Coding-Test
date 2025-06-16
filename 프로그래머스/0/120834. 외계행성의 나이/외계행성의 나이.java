class Solution {
    public String solution(int age) {
        String answer = "";
        String[] str = Integer.toString(age).split("");
        
        for(int i = 0; i < str.length; i++) {
            answer+= (char)(Integer.parseInt(str[i]) + 97);
        }
        return answer;
// Integer.parseInt(str[i])는 각 문자열 숫자를 정수로 변환한다.
// 97을 더하는 이유는 ASCII 코드에서 'a'의 값이 97이기 때문이며, 각 숫자에 97을 더하면 0은 'a', 1은 'b', 2는 'c'와 같이 변환된다.
// (char)를 사용하여 정수를 문자로 변환
        
        // String str = "" + age;
        // for(int i = 0; i <= 9; i++) {
        //     str = str.replace("" + i, "" + (char)(i + 'a'));
        // }
        // return str;
    
// replace("" + i, "" + (char)(i + 'a'))는 i를 문자열로 변환하여 i + 'a'에 해당하는 문자로 치환합니다.
// i + 'a'는 각 숫자를 알파벳 소문자로 변환합니다. 예를 들어, 0 + 'a'는 'a', 1 + 'a'는 'b'가 됩니다.
// (char)를 사용하여 숫자를 문자로 변환합니다.        
    }
}