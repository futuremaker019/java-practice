import java.util.HashMap;

public class Day38 {

    // Longest Palindrome - leetcode (탐욕법)

    public static void main(String[] args) {

    }

    /*
        짝수인것과 홀수인것을 구분한다?
    */
    public static int solution(String s) {
        // 각 문자의 등장 횟수를 저장하기 위한 해시맵 생성
        HashMap<Character, Integer> charCount = new HashMap<>();

        // 문자열에서 각 문자의 등장 횟수를 카운트
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        boolean oddFound = false; // 홀수 개 문자가 있는지 여부를 저장

        // 각 문자의 등장 횟수를 기반으로 팰린드롬의 최대 길이를 계산
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                // 짝수 개의 문자는 모두 팰린드롬에 포함 가능
                result += count;
            } else {
                // 홀수 개의 문자는 짝수 개로 만들고 하나는 중간에 올 수 있음
                result += count - 1;
                oddFound = true;
            }
        }

        // 홀수 개의 문자가 하나라도 있으면, 그 중 하나는 중간에 올 수 있음
        if (oddFound) {
            result += 1;
        }

        return result;
    }

}
