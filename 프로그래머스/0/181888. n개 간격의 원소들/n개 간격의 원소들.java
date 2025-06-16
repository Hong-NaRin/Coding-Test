import java.util.*;
class Solution {
    public List solution(int[] num, int n) {
        
//         int[] arr = new int[num.length];
//         int cnt = 0;
        
//         if(num.length % n == 0) {
//             arr = new int[num.length/n];
//         }
//         else {
//             arr = new int[(num.length/n) + 1];
//         }
        
//         for(int i = 0; i < num.length; i+=n) {
//             arr[cnt] = num[i];
//             cnt++;
//         }
//         return arr;
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< num.length; i += n) {
            list.add(num[i]);
        }
        return list;
    }
}