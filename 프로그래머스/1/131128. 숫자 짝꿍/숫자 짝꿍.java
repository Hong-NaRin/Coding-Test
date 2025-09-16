import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xx = new int[10];
        int[] yy = new int[10];
        
        StringBuilder sb = new StringBuilder();
        
        for(String x : X.split("")) {
            xx[Integer.parseInt(x)]++;
        }
        
        for(String y : Y.split("")) {
            yy[Integer.parseInt(y)]++;
        }
        
        for(int i = xx.length-1; i >= 0; i--) {
            while(xx[i] > 0 && yy[i] > 0) {
                sb.append(Integer.toString(i));
                xx[i]--;
                yy[i]--;
            }
        }
        
        if(sb.length() == 0) return "-1";
        if("".equals(sb.toString().replaceAll("0", ""))) return "0";
            
        return sb.toString();
    }
}