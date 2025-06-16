class Solution {
    public int[] solution(int[] num) {
        
        int last = 0;
        int[] arr = new int[num.length+1];
        
        for(int i = 0; i < num.length; i++) {
            arr[i] = num[i]; 
        }
        
        if(num[num.length-1] > num[num.length-2]) {
             last = num[num.length-1] - num[num.length-2];
        }
        else {
             last = num[num.length-1] * 2;
        }
        arr[arr.length-1] = last; // 마지막 인덱스는 length-1
        return arr;
    }
}