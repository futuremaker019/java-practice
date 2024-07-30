import java.util.Stack;

public class Day08 {

    public static void main(String[] args) {
        /**
         "()()"	true
         "(())()"	true
         ")()("	false
         "(()("	false
         */
        String value1 = "()()";
        String value2 = "(())()";
        String value3 = ")()(";
        String value4 = "(()(";

        boolean solution = solution(value1);
        System.out.println("solution = " + solution);
        boolean solution1 = solution(value2);
        System.out.println("solution1 = " + solution1);
        boolean solution2 = solution(value3);
        System.out.println("solution2 = " + solution2);
        boolean solution3 = solution(value4);
        System.out.println("solution3 = " + solution3);

        boolean b = solution1(value1);
        boolean bb = solution1(value2);
        boolean bbb = solution1(value3);
        boolean bbbb = solution1(value4);
        System.out.println("b = " + b);
        System.out.println("bb = " + bb);
        System.out.println("bbb = " + bbb);
        System.out.println("bbbb = " + bbbb);
    }

    public static boolean solution(String s) {
        /**
         * 스택을 구현해서 값을 넣고 ")"이거 젤 처음에 들어오면 return false 치면 되지 않을까 싶다
         * 스택이 비어있다면 push, 스택의 값을 꺼내서 다음 값과 비교하여 하나의 pair 면 pop, 아니면 push
         */
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
                continue;
            }
            if (stack.peek() == '(' && chars[i] == ')') {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

    public static boolean solution1(String s) {
        /**
         각 상반된 괄호가 나올때마다 카운트를 더하고 빼며 마지막 `0`이 나오는지 확인
            `음수`면 바로 return false
         */
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            }
            if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

}
