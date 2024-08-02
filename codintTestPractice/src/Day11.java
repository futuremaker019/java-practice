import java.util.Arrays;
import java.util.Collections;

public class Day11 {

    public static void main(String[] args) {
        long solution = solution(118372);
        System.out.println("solution = " + solution);
    }

    public static long solution(long n) {
        String[] charArray = String.valueOf(n).split("");
        Arrays.sort(charArray);

        System.out.println("charArray = " + Arrays.toString(charArray));
        String newString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            newString += charArray[i];
        }

        long answer = Long.parseLong(newString);
        return answer;
    }

}
