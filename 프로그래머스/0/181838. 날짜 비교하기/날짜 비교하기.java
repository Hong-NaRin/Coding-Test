class Solution {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i < date1.length; i++) {
            if(date1[i] < date2[i]) return 1;
            else if(date1[i] > date2[i]) return 0;
        }
        return 0;
        
        // if(date1[0] < date2[0]) {
        //     return 1; 
        // } else if(date1[0] > date2[0]) {
        //     return 0;
        // } if(date1[1] < date2[1]) {
        //     return 1;
        // } else if(date1[1] > date2[1]) {
        //     return 0;
        // } if(date1[2] < date2[2]) {
        //     return 1;
        // } else if(date1[2] > date2[2]) {
        //     return 0;
        // }
        // return 0;
    }
}