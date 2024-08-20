package day28;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /**
     *  프로그래머스 - 프로세스
     */

    public static void main(String[] args) {

    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        // 1. 프로세스와 위치 정보를 담는 큐를 생성
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});  // {인덱스, 우선순위}
        }

        // 2. 큐에서 우선순위대로 프로세스를 처리
        while (!queue.isEmpty()) {
            // 큐에서 프로세스 하나를 꺼냄
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            // 현재 프로세스보다 우선순위가 높은 것이 남아 있는지 확인
            for (int[] process : queue) {
                if (process[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            // 만약 우선순위가 높은 프로세스가 있으면 다시 큐에 넣음
            if (hasHigherPriority) {
                queue.add(current);
            } else {
                // 우선순위가 높은 것이 없으면 프로세스 실행
                answer++;
                // 이 프로세스가 내가 찾는 위치의 프로세스인지 확인
                if (current[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }



}
