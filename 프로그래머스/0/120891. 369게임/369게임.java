class Solution {
    public int solution(int order) {
        int cnt = 0;
        // String str = "" + order;
        String str = Integer.toString(order);
        for(int i = 0; i < str.length(); i++){  
            char ch = str.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9') {
                cnt++;
            }
        }
        return cnt;
    }
}