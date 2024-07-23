import java.util.Arrays;

public class Day02 {

    /**
     * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
     */
    /**
     * [1,2,3,4]	2.5
     * [5,5]	5
     */
    public static void main(String[] args) {
        int[] value = {5,5};
        double solution = solution(value);
        System.out.println("solution = " + solution);
        double solution2 = solution2(value);
        System.out.println("solution2 = " + solution2);
    }

    public static double solution(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double value = 0;
        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
        }

        return value / arr.length;
    }

    public static double solution2(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

}
