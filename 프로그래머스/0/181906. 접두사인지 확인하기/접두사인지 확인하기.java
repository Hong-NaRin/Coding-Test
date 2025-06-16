class Solution {
    public int solution(String my_string, String is_prefix) {
        if(my_string.startsWith(is_prefix)) return 1;
        else return 0;
        
//         int k = 1;
//         int answer = 0; 
        
//         String[] arr = new String[my_string.length()];
//         for(int i = 0; i < my_string.length(); i++) {
//             arr[i] = my_string.substring(0, k);
//             k++; 
//         }
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i].equals(is_prefix)) answer = 1;
//         }
//     return answer;
    }
}