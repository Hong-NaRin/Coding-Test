class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for(int i = 0; i< board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    for(int l = 0; l < 8; l++) {
                        int nx = i + dx[l];
                        int ny = j + dy[l];
                        if(nx >= 0 && ny >= 0 && nx < board.length && ny < board.length) {
                            if(board[nx][ny] == 0) {
                                board[nx][ny] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        int safeCount = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) safeCount++;
            }
        }
        return safeCount;
    }
}