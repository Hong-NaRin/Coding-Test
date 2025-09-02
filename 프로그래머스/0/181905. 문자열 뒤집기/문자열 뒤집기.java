class Solution {
    public String solution(String my_string, int s, int e) {
        String start = my_string.substring(0, s);
        String str = my_string.substring(s, e+1);
        String end = my_string.substring(e+1, my_string.length());
        
        String sub = "";
        
        for(int i = str.length()-1; i >= 0; i--) {
            sub += str.charAt(i);
        }
        
        return start+sub+end;
    }
}