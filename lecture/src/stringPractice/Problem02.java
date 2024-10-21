package stringPractice;

import java.util.Scanner;

public class Problem02 {

    /**
        대소문자 변환

        대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
        변환하여 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String result = solution(input);
        System.out.println(result);

    }

    public static String solution(String value) {
        StringBuilder sb = new StringBuilder();
        char[] ca = value.toCharArray();
        for (char c :  ca) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }



}
