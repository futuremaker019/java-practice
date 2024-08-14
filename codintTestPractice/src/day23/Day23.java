package day23;

public class Day23 {

    /**
     * Array Partition - leet code (탐욕법)
     *
     */

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] value1 = new int[]{1,4,3,2};
        int[] value2 = new int[]{6,2,6,5,1,2};
        int i = solution.arrayPairSum(value1);
        System.out.println(i);
        int i1 = solution.arrayPairSum(value2);
        System.out.println(i1);
    }

}
