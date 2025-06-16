class Solution {
    public int solution(String myString, String pat) {
        String str = myString.toUpperCase();
        String PAT = pat.toUpperCase();
        return str.contains(PAT) ? 1 : 0;
    }
}