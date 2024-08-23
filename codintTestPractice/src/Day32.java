import java.util.Scanner;

public class Day32 {

    // 백준 - Bad Grass 6080

    // 8방향을 나타내는 배열 (상, 하, 좌, 우, 대각선 4방향)
    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static int R, C;
    private static int[][] grid;   // 목장의 고도 정보
    private static boolean[][] visited; // 방문 여부

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // R과 C 입력 받기
        R = sc.nextInt();
        C = sc.nextInt();

        grid = new int[R][C];
        visited = new boolean[R][C];

        // 지도 정보 입력 받기
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int islandCount = 0; // 나쁜 풀 섬의 개수

        // 모든 칸을 탐색하며 섬을 찾음
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // 나쁜 풀이고 아직 방문하지 않은 칸이면 새로운 섬 발견
                if (grid[i][j] > 0 && !visited[i][j]) {
                    dfs(i, j); // 섬 탐색 시작
                    islandCount++; // 섬의 개수 증가
                }
            }
        }

        // 결과 출력
        System.out.println(islandCount);

        sc.close();
    }

    // DFS로 섬을 탐색하는 함수
    public static void dfs(int x, int y) {
        visited[x][y] = true; // 현재 위치 방문 처리

        // 8방향 탐색
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위를 벗어나지 않고, 아직 방문하지 않았으며, 나쁜 풀(고도 0보다 큰 경우)이면 탐색
            if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && grid[nx][ny] > 0) {
                dfs(nx, ny);
            }
        }
    }
}
