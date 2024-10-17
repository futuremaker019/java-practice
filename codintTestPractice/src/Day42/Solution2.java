package Day42;

public class Solution2 {

    public int answer(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // 현재까지의 최소 주식 가격
        int maxProfit = 0; // 최대 이익

        for (int i = 0; i < prices.length; i++) {
            // 현재 가격이 최소 가격보다 작은 경우 최소 가격 업데이트
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // 현재 가격에서 사면 얻을 수 있는 이익 계산
            else {
                int profit = prices[i] - minPrice;
                // 최대 이익을 업데이트
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

}
