package day22;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        if (rowIndex == 0) {
            return answer;
        }

        int val = 1;
        for (int i = 1; i < rowIndex; ++i) {
            val = (val * (rowIndex - (i - 1))) / i;
            answer.add(val);
        }
        answer.add(1);

        return answer;
    }

}
