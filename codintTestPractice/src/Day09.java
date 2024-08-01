import java.util.*;

public class Day09 {
    public static void main(String[] args) {
        int[] value = new int[]{10,3,8,9,4};

        String[] result = solution(value);
    }

    public static String[] solution(int[] score) {
        // sort 알고리즘으로 덥고
        String gold = "Gold Medal";
        String silver = "Silver Medal";
        String bronze = "Bronze Medal";

        int[] clonedScore = new int[score.length];
        int n = score.length;
        for (int i = 0; i < n; i++) {
            clonedScore[i] = score[i];
        }

        Arrays.sort(clonedScore);
        System.out.println("clonedScore = " + Arrays.toString(clonedScore));

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(clonedScore[i], n - i);
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            int rank = map.get(score[i]);
            if (rank == 1) {
                result[i] = gold;
            } else if (rank == 2) {
                result[i] = silver;
            } else if (rank == 3) {
                result[i] = bronze;
            } else {
                result[i] = String.valueOf(rank);
            }
        }

        return result;
    }
}
