import java.util.ArrayList;
import java.util.List;

public class Day15 {

    /**
     * 프로그래머스 - 모의고사 (완전탐색)
     */

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        solution(arr);
        int[] arr1 = {1, 3, 2, 4, 2};
        solution(arr1);
    }

    public static int[] solution(int[] answers) {

        /**
         전체의 배열을 모두 순회하면서 비교한다.
         */
        int[] case1 = {1,2,3,4,5};
        int case1Count = 0;
        int[] case2 = {2,1,2,3,2,4,2,5};
        int case2Count = 0;
        int[] case3 = {3,3,1,1,2,2,4,4,5,5};
        int case3Count = 0;

        for (int i = 0; i < answers.length; i++) {
            if (case1[i % case1.length] == answers[i]) {
                case1Count++;
            }
            if (case2[i % case2.length] == answers[i]) {
                case2Count++;
            }
            if (case3[i % case3.length] == answers[i]) {
                case3Count++;
            }
        }

        List<Integer> list = new ArrayList<>();
        // max 값을 비교
        int max = 0;
        if (case1Count >= case2Count) {
            max = case1Count;
        } else {
            max = case2Count;
        }

        if (case3Count >= max) {
            max = case3Count;
        }

        if (max == case1Count) {
            list.add(1);
        }
        if (max == case2Count) {
            list.add(2);
        }
        if (max == case3Count) {
            list.add(3);
        }


        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
