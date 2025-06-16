class Solution {
    public boolean solution(int x) {
        String[] arr = Integer.toString(x).split("");
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]);
        }
        return x % result == 0? true:false;
    }
}