public class Day16 {

    /**
     * 프로그래머스 - 최소 직사각형 (완전탐색, 2차원배열)
     */

    public static void main(String[] args) {
        int[][] value = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int solution = solution(value);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] sizes) {
        /**
         * 결국 큰 값의 최대값, 작은값 중의 최대값을 구하라는 문제이다.
         *      2차원 배열 공부 필요
         */

        int maxHorizon = 0;
        int maxVertical = 0;

        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            maxHorizon = Math.max(maxHorizon, max);
            maxVertical = Math.max(maxVertical, min);
        }

        return maxHorizon * maxVertical;
    }

}
