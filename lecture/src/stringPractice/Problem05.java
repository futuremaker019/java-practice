package stringPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Problem05 {

    /**
        특정 문자 뒤집기
     */
    public static void main(String[] args) {
        String solution = solution("a#b!GE*T@S");
        System.out.println("solution = " + solution);

        String solution2 = solution2("a#b!GE*T@S");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String str) {
        char[] ca = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ca.length; i++) {
            if (Character.isLetter(ca[i])) {
                sb.append(ca[i]);
            }
        }

        char[] cca = sb.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        int count  = cca.length;
        for (int i = 0; i < ca.length; i++) {
            if (Character.isLetter(ca[i])) {
                result.append(cca[count - 1]);
                count--;
            } else {
                result.append(ca[i]);
            }
        }

        return result.toString();
    }

    public static String solution2(String str) {
        char[] ca = str.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : ca) {
            if (Character.isLetter(c)) {
                charList.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int count = charList.size() - 1;
        for (char c : ca) {
            if (Character.isLetter(c)) {
                result.append(charList.get(count));
                count--;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

}
