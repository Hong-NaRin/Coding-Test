class Solution {
    public int[] solution(int start, int end) {
        int[] arr = new int[end - start + 1];
        
        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = start + i;
            if( i == arr.length - 1) {
                arr[i] = end;
            }
        }
        return arr;
    }
}