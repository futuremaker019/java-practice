import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        System.out.println("getInvIdxByRandomNum : " + getInvIdxByRandomNum());
        System.out.println("getUserIdxForAssetByRandomNum : " + getUserIdxForAssetByRandomNum());

    }

    private static int getUserIdxByRandomNum() {
        int num = 0;
        int randomNum = (int)((Math.random()*10000)%10);		// 0 ~ 10 난수
        if (randomNum <= 2) {
            num = 2;
        } else if (randomNum <= 3 && randomNum < 5) {
            num = 3;
        } else if (randomNum >= 5 && randomNum < 7) {
            num = 7;
        } else if (randomNum >= 7 && randomNum < 9) {
            num = 11;
        } else if (randomNum >= 9 && randomNum < 11) {
            num = 15;
        }

        return num;
    }

    /**
     * (int) Math.random() * (최댓값-최소값+1) + 최소값
     *
     *  예시) 1 ~ 12까지의 랜덤 숫자 10가지 출력
     *
     *  (int) (Math.random() * (12-1+1)) + 1
     */
    private static int getInvIdxByRandomNum() {
        int num = 0;
        int randomNum = (int)(Math.random() * (3552 - 1 + 1)) + 1;

        return randomNum;
    }

    // 18 ~ 68
    public static int getUserIdxForAssetByRandomNum() {
        int randomNum = 0;
        randomNum = (int)(Math.random() * (68 - 18 + 1)) + 1;

        return randomNum;
    }
}
