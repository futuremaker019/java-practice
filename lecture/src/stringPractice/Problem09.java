package stringPractice;

import java.util.Scanner;

public class Problem09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(String s) {
        char[] ca = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ca) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        String value = sb.toString();
        return Integer.parseInt(value);
    }

}
