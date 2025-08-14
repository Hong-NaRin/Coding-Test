import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        // 1. 그래프
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for(int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] road : roads) {
            graph[road[0]].add(road[1]);
            graph[road[1]].add(road[0]);
        }
        
        // 2. 거리 배열
        int [] dist = new int[n+1];
        Arrays.fill(dist, -1);
        
        // 3. BFS (목적지에서 모든 지점 최단거리 계산)
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(destination);
        dist[destination] = 0;
        
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for(int next : graph[cur]) {
                if(dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    queue.offer(next);
                }
            }
        }
        
        int[] result = new int[sources.length];
        for(int i = 0; i< sources.length; i++) {
            result[i] = dist[sources[i]];
        }
        return result;
    }
}