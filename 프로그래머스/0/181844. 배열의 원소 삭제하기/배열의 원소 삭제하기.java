import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr) list.add(num);
        
        for(int del : delete) {
            if(list.contains(del)) {
                list.remove(Integer.valueOf(del));
            }
        }
        
        int answer[] = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
        
//      int cnt = 0;
// 		int[] newArr = new int[arr.length];
		
// 		outer:for(int num : arr) {
// 			for(int delNum : delete_list) {
// 					if(num==delNum) continue outer;
// 			}
// 			newArr[cnt++] = num; //delete_list에 없을 경우 새 배열에 저장
// 		}
		
// 		newArr = Arrays.copyOf(newArr, cnt);
// 		return newArr;
    }
}