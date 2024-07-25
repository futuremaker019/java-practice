public class Day04 {

    public static void main(String[] args) {
        int solution = solution("-1234");
        System.out.println("solution = " + solution);
        int so = solution2("-1234");
        System.out.println("so = " + so);
    }

    public static int solution(String s) {
        char[] ca = s.toCharArray();
        int value = 0;
        for (char c : ca) {
            if (Character.isDigit(c)) {
                value = value * 10 + Character.getNumericValue(c);
            }
        }
        if (ca[0] == '-') {
            value = -value;
        }

        return value;
    }

    public static int solution2(String s) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return Sign?1:-1 * result;
    }

}
