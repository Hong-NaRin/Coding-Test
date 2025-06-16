class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int cnt = 0;
        int p = 0;
        String[] arr = polynomial.split(" "); 
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")) {
                if(arr[i].equals("x")) cnt++;
                else cnt += Integer.parseInt(arr[i].replace("x", "")); 
            }
            else if(!arr[i].equals("+")) p += Integer.parseInt(arr[i]);
        }
        if(cnt > 1 && p >= 1) answer = cnt+"x + "+p; 
        else if(cnt > 1 && p == 0) answer = cnt+"x";
        else if(cnt == 1 && p >= 1) answer = "x + "+p ;
        else if(cnt == 1 && p == 0 ) answer = "x";
        else if(cnt == 0 && p >= 1) answer = String.valueOf(p);
        return answer;
    }
}