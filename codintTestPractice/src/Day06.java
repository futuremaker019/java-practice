import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day06 {
    public static void main(String[] args) {
        int[] value1 = {3, 1, 2, 3};    //  2
        int[] value2 = {3, 3, 3, 2, 2, 4};   //	3
        int[] value3 = {3, 3, 3, 2, 2, 2};   //	2
        int solution1 = solution(value1);
        int solution2 = solution(value2);
        int solution3 = solution(value3);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);

    }

    public static int solution(int[] nums) {
        /**
            배열 안에 최대로 가질수 있는 포켓몬의 수 -> 이게 핵심
            그리고 항상 절반의 수만 가져갈 수 았다. -> 최대 절반 (아무리 위에 수가 많아도)
            배열은 항상 짝수로 나오며 절반의 숫자를 골라야 한다.
         */
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(set.size(), nums.length / 2);
    }


}
