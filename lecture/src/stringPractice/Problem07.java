package stringPractice;

import java.util.Scanner;

public class Problem07 {

    /**
     * 회문 문자열
     *
     *  회문이면 YES, 아니면 NO 를 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(String str) {
        char[] ca = str.toLowerCase().toCharArray();
        String result = "YES";
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ca[ca.length - i - 1]) {
                result = "NO";
            }
        }
        return result;
    }

}
