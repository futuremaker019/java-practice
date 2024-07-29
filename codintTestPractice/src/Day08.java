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
    }

    public static boolean solution(String s) {

        /**
         * 스택을 구현해서 값을 넣고 ")"이거 젤 처음에 들어오면 return false 치면 되지 않을까 싶다
         * 2개의 스택을 만들어 하나는 '(', 다른 하나는 ')' 를 stack에서 peek 해서 하나의 괄호를 만들어주면 될듯
         */
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < chars.length; i++){
        }
        return stack.isEmpty();

    }

}
