package day25;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        // Step 1: 그래프를 인접 리스트 형태로 구성
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Step 2: DFS 탐색 시작
        boolean[] visited = new boolean[n];  // 방문 확인용 배열
        return dfs(graph, visited, source, destination);
    }

    // DFS 함수 구현
    private static boolean dfs(List<List<Integer>> graph, boolean[] visited, int node, int destination) {
        if (node == destination) {
            return true;  // 목적지에 도착하면 true 반환
        }
        visited[node] = true;  // 현재 정점 방문 처리

        // 인접한 모든 정점을 확인
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(graph, visited, neighbor, destination)) {
                    return true;  // 목적지에 도달하면 true 반환
                }
            }
        }

        return false;  // 모든 경로를 탐색해도 목적지에 도달하지 못하면 false 반환
    }

}
