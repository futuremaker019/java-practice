package stringPractice;

import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(String str) {
        char[] ca = str.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ca) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        String result = "YES";
        char[] chars = sb.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                result = "NO";
            }
        }
        return result;
    }

    public static String solution2(String str) {
        char[] ca = str.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ca) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        String value = sb.toString();
        String reversedValue = sb.reverse().toString();
        if (value.equals(reversedValue)) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
