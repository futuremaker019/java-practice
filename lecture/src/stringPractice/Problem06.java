package stringPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem06 {

    // 중복문자제거
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(String str) {
        List<Character> charList = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!charList.contains(c)) {
                sb.append(c);
                charList.add(c);
            }
        }


        return sb.toString();
    }
}
