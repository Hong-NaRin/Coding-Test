class Solution {
    public int solution(int[] box, int n) {
        int cnt = box[0] / n;
        int cnt1 = box[1] / n;
        int cnt2 = box[2] / n;
        return cnt*cnt1*cnt2;
    }
}