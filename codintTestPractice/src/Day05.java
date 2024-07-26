import java.util.*;

public class Day05 {

    /**
        완주하지 못한 선수

        2개의 배열을 비교하여 없는 선수를 뽑아낸다.
            - 같은 이름을 가진 선수는 그 중 하나만 뽑아낸다.
     */
    public static void main(String[] args) {
        String[] p = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c = new String[]{"josipa", "filipa", "marina", "nikola"};

        String solution = solution(p, c);
        System.out.println("solution = " + solution);
        String s = solution2(p, c);
        System.out.println("s = " + s);
    }

    public static String solution(String[] participant, String[] completion) {
        // 두 배열을 한번만 돌면서 어떻게 비교할까 - 한명의 사람만 뽑아낸다.
        // `O(n)`의 형태로 풀어야 한다. 아니면 무조건 타임아웃
        /**
         *  배열을 탐색하는 방식 - 탐색을 어떻게 해야할까
          */
        // 타임아웃 됨 - completions.contains(p) 이거 때문인듯
        String answer = "";
        List<String> completions = Arrays.asList(completion);
        for (String p: participant) {
            if (!completions.contains(p)) {
                answer = p;
                break;
            }
        }

        return answer;
    }

    /**
     *  통과
     */
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";

        // Arrays.sort(strArr, Collections.reverseOrder()); // 내림차순
        Arrays.sort(participant);   // 소팅
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            // 정렬 후 사람 이름을 처음부터 비교한다.
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        // 비교 후에도 answer 에 값이 담겨있지 않으면 가장 participant의 가장 마지막 사람이다.
        if (answer.isEmpty()) {
            answer = participant[participant.length - 1];
        }
        return answer;
    }
}
