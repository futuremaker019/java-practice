package stringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Problem04 {

    /**
        단어 뒤집기

        N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intInput = sc.nextInt();

        String[] strArr = new String[intInput];
        for (int i = 0; i < intInput; i++) {
            strArr[i] = sc.next();
        }

        String[] result = solution(strArr);
        Arrays.asList(result).forEach(System.out::println);
    }

    public static String[] solution(String[] s) {
        String[] result = new String[s.length];
        int i = 0;
        for (String value: s) {
            StringBuilder sb = new StringBuilder();
            StringBuilder reversedValue = sb.append(value).reverse();
            result[i] = reversedValue.toString();
            i++;
        }
        return result;
    }

}
