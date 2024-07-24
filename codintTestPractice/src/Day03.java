import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day03 {
    public static void main(String[] args) {
        String value = "PPoooY";
        boolean solution = solution(value);
        System.out.println("solution = " + solution);
    }

    public static boolean solution(String s) {
        int countP = 0;
        int countY = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') {
                countP++;
            } else if (c == 'y') {
                countY++;
            }
        }

        return countP == countY;
    }

}
