import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        // 배열을 스트림으로 변환하여 리스트로 변환
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        // 첫 번째 2의 인덱스와 마지막 2의 인덱스를 찾음
        int s = list.indexOf(2);
        int e = list.lastIndexOf(2);
        
        // 2가 배열에 존재하는 경우 부분 배열을 반환
        return s >= 0 ? Arrays.copyOfRange(arr, s, e+1) : new int[] {-1};
        
//         int s=-1;
//         int e=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==2){
//                 s=i;
//                 break;
//             }
//         }
//         for(int i=arr.length-1;i>=0;i--){
//             if(arr[i]==2){
//                 e=i;
//                 break;
//             }
//         }
//         int arr2[] = new int[e-s+1];
//         if(e==-1&&s==-1){
//             return new int[]{-1};
//         }else if(e-s==0){
//             return new int[]{2};
//         }else{
//             for(int i=s;i<=e;i++){
//                 arr2[i-s] = arr[i];
//             }
//         }
//         return arr2;
    }
}