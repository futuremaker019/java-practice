import java.util.Scanner;

public class Day37 {

    // 백준 - 수학적 호기심 (완전탐색) 9094

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int count = solution(n, m);
            System.out.println(count);
        }

        sc.close();
    }

    public static int solution(int n, int m) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (calc(i, j, m) == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int calc(int a, int b, int m) {
        return ((a * a) + (b * b) + m) / a * b;
    }

}
