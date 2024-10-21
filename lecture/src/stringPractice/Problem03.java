package stringPractice;

import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String value) {
        String[] strings = value.split(" ");
        String result = strings[0];
        for(int i = 1; i < strings.length; i++) {
            if (result.length() < strings[i].length()) {
                result = strings[i];
            }
        }
        return result;
    }

}
