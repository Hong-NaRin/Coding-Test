import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        // String[] answer = new String[picture.length * k];   
        // int cnt = 0;
        // for(int i = 0; i < picture.length; i++) {
        //     String s = "";
        //     for(int j = 0; j < picture[i].length(); j++) {
        //         for(int p = 0; p < k; p++) {
        //             s += String.valueOf(picture[i].charAt(j));
        //         }  
        //     } 
        //     for(int q = 0; q < k; q++) {
        //         answer[cnt++] = s;
        //     }
        // }
        // return answer;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < picture.length; i++) {
            String[] arr = picture[i].split("");
            String str = "";
            for(int j = 0; j < arr.length; j++) {
                str += arr[j].repeat(k);
            }
            for(int m = 0; m < k; m++) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}