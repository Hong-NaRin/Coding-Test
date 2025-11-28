import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        int x = arr[0], y = arr[1], z = arr[2], w = arr[3];
        
        // 4개 모두 같음 
        if(x == w) return 1111 * x;
        
        // 3개 같음 
        if(x == z || y == w) {
            int p = (x == z) ? x : y;
            int q = (x == z) ? w : x;
            return (int)Math.pow(10 * p + q, 2);
        }
        
        // 2개 같음
        if(x == y && z == w) {
            return (x + z) * Math.abs(x - z);
        }
        
        // 한 쌍만 같고 나머지 서로 다름 
        if(x == y) return z * w;
        if(y == z) return x * w;
        if(z == w) return x * y;
        
        // 모두 다를 때 가장 작은 값 
        return x;
    }
}
