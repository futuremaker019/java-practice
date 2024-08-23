import java.util.*;

public class Day31 {

    // 백준 - clear code war

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        int C = sc.nextInt();

        // 트리 구조를 저장할 리스트 배열 초기화
        List<Integer>[] tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        // 연결 정보 입력받기
        for (int i = 0; i < C; i++) {
            int E_i = sc.nextInt();
            int B1_i = sc.nextInt();
            int B2_i = sc.nextInt();

            // 트리 연결 설정 (양방향 연결)
            tree[E_i].add(B1_i);
            tree[E_i].add(B2_i);
            tree[B1_i].add(E_i);
            tree[B2_i].add(E_i);
        }

        // BFS로 거리 계산
        int[] distances = new int[N + 1];  // 거리를 저장할 배열
        Arrays.fill(distances, -1);        // 초기값으로 -1 설정 (미방문 표시)
        distances[1] = 1;                  // 1번 파이프는 거리 1로 설정

        // BFS 큐 설정
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // 1번 파이프에서 시작

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // 현재 파이프와 연결된 파이프 탐색
            for (int neighbor : tree[current]) {
                if (distances[neighbor] == -1) {  // 아직 방문하지 않은 파이프라면
                    distances[neighbor] = distances[current] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        // 결과 출력 (1번 파이프부터 N번 파이프까지의 거리)
        for (int i = 1; i <= N; i++) {
            System.out.print(distances[i] + " ");
        }
    }


    public static int solution(int[] a) {


        return 0;
    }

    public static int dfs(int count) {
        return 0;
    }

}
