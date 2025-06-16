class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] ch = my_string.toCharArray();
        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);
        return String.valueOf(ch);
        
        // String[] str = my_string.split("");
        // String temp = "";
        // temp = str[num1];
        // str[num1] = str[num2];
        // str[num2] = temp;
        // return String.join("", str);
    }
}