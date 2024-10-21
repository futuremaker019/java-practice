package stringPractice;

import java.util.Scanner;

public class Problem01 {

    /**
        문자 찾기

        한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개
        존재하는지 알아내는 프로그램을 작성
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        char value = input2.charAt(0);
        int solution = solution(input1, value);
        System.out.println(solution);
    }

    public static int solution(String value, char charValue) {
        int result = 0;
        char lowerCharValue = Character.toLowerCase(charValue);
        char[] ca = value.toLowerCase().toCharArray();
        for (char c : ca) {
            if (lowerCharValue == c) {
                result++;
            }
        }

        return result;
    }

}
