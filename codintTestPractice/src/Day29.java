import java.util.Arrays;
import java.util.stream.IntStream;

public class Day29 {

    /**
     * 이분탐색법
     * leetcode - Missing Number (268)
     */

    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 0, 1};
        int[] nums2 = new int[]{0, 1};
        int[] nums3 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums4 = new int[]{1};
        int i = missingNumber(nums1);
        System.out.println("i = " + i);
        int i1 = missingNumber(nums2);
        System.out.println("i1 = " + i1);
        int i2 = missingNumber(nums3);
        System.out.println("i2 = " + i2);
        int i3 = missingNumber(nums4);
        System.out.println("i3 = " + i3);
    }

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int missing = 0;
        int count = 0;
        int[] ints = IntStream.range(0, len + 1).toArray();
        for (int value: nums) {
            if (ints[count] != value) {
                missing = ints[count];
                break;
            }
            count++;
        }
        if (missing == 0 && count == nums.length - 1) {
            missing = ints[ints.length - 1];
        }
        return missing;
    }


    public static int anotherSolution(int[] nums) {
        int len = nums.length;
        int expectedSum = len * (len + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

}
