package Day42;

public class Solution {

    /**
     * 작은값과 가장 작은값의 인덱스를 구해야 한다.
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < prices.length; i++) {
            if (minValue > prices[i]) {
                minValue = prices[i];
                minIndex = i;
            }
        }

        // 작은 값이 없을떄
        if (minIndex == prices.length - 1) {
            return result;
        }

        for (int i = minIndex + 1; i < prices.length; i++) {
            int value = prices[i] - minValue;
            if (result < value) {
                result = value;
            }
        }

        return result;
    }




}
