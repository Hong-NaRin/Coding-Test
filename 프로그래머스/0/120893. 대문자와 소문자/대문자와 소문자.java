class Solution {
    public String solution(String mystr) {
        
        String str = "";
        for(int i = 0; i < mystr.length(); i++) {
            char c = mystr.charAt(i);
            if(Character.isUpperCase(c)) {
                str += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)) {
                str += Character.toUpperCase(c);
            }
        }
        return str;
    }
}