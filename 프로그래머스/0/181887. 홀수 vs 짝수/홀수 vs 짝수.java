class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for(int i= 0; i < num_list.length; i++) {
            if((i+1) % 2 != 0) odd += num_list[i];
            else even += num_list[i];
        }
        return even > odd ? even : odd;
    }
}