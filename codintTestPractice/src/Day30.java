public class Day30 {

    /**
     * Arranging Coins  - Leet code (이분탐색)
     */

    public static void main(String[] args) {
        int i2 = arrangeCoins(1);
        System.out.println("i2 = " + i2);
        int i = arrangeCoins(5);
        System.out.println("i = " + i);
        int i1 = arrangeCoins(8);
        System.out.println("i1 = " + i1);
    }

    public static int arrangeCoins(int n) {
        int count = 1;
        while (n > 0) {
            n -= count;
            if (n < 0) {
                count -= 1;
                break;
            }
            if (n == 0) {
                break;
            }
            count++;
        }

        return count;
    }

}
