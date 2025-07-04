class Solution {
    public int solution(int[][] sizes) {
        int width  = 0;
        int height = 0;
        
        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);  //긴 부분
            int h = Math.min(sizes[i][0], sizes[i][1]);  //짧은 부분
            width = Math.max(width, w);
            height = Math.max(height, h);
        }
        return width*height;
    }
}