package Day42;

public class Day42 {

    // Best Time to Buy and Sell Stock - leetcode  (동적계획법)

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values1 = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(values1);
        System.out.println("result = " + result);

        int[] values2 = {2, 4, 1};
        int i = solution.maxProfit(values2);
        System.out.println("i = " + i);
    }

}
