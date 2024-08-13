package day22;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);  // 첫 번째 요소는 항상 1

        for (int i = 1; i <= rowIndex; i++) {
            // 이전 행을 역순으로 순회하면서 값을 업데이트
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);  // 끝에 1 추가
        }

        return row;
    }

}


