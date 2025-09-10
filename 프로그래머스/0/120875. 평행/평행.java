class Solution {
    public int solution(int[][] dots) {
        double slope1, slope2;
        
        // 경우 1: (0,1) vs (2,3)
        slope1 = (double)(dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        slope2 = (double)(dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        if (slope1 == slope2) return 1;

        // 경우 2: (0,2) vs (1,3)
        slope1 = (double)(dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]);
        slope2 = (double)(dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);
        if (slope1 == slope2) return 1;

        // 경우 3: (0,3) vs (1,2)
        slope1 = (double)(dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);
        slope2 = (double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
        if (slope1 == slope2) return 1;

        return 0;
    }
}