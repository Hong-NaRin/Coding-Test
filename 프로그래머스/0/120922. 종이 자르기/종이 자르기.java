class Solution {
    public int solution(int M, int N) {
        return (N>=1 && M>=1) ? M * (N-1) + (M-1) : 0; 
        // M줄을 만들기 위해 가위질 (M-1) + M줄에 N칸이 되려면 가위질 M * (N-1) 
        // 2 * 5를 만드려면 세로 2줄을 만들기 위해 1번 가위질 하고 + 가로 5칸을 만들기 위해 2줄을 전부 4번 가위질 (8번)함
    }
}