import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        if(n == 1) {
            for(int i = 0; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        }
        else if(n == 2) {
            for(int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        }
        else if(n == 3) {
            for(int i = slicer[0]; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        }
        else {
            for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
                list.add(num_list[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
        
//      int[] answer = {};
//     	int idx = 0;
    	
//     	if (n == 1) {
//     		answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
//     	} else if (n == 2) {
//     		answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
//     	} else if (n == 3) {
//     		answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
//     	} else {
//     		answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
//     		for(int i = slicer[0]; i <= slicer[1]; i+=2) {
//     			answer[idx++] += num_list[i];
//     		}
//     	}
//     	return answer;
    }
}