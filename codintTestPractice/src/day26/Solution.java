package day26;

public class Solution {

    public int[] solution(String[] wallpaper) {
        // 초기화: 최소값은 큰 값으로, 최대값은 작은 값으로
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        // 2차원 배열 탐색
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 최소 좌표 업데이트
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    // 최대 좌표 업데이트
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }

        // rdx, rdy는 포함 범위를 고려해서 +1
        return new int[] {lux, luy, rdx + 1, rdy + 1};
    }

}
