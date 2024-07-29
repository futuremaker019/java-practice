import java.util.ArrayList;
import java.util.List;

public class Day07 {

    public static void main(String[] args) {
        int[] values = new int[]{0,1,3,3,0,1,1};
        solution(values);
    }

    public static int[] solution(int[] arr) {
        List<Integer> data = new ArrayList<>();
        data.add(arr[0]);
        int value = data.get(0);
        for (int i = 0; i < arr.length; i++) {
            if (value != arr[i]) {
                data.add(arr[i]);
                value = arr[i];
            }
        }
        System.out.println("data = " + data);
        return data.stream().mapToInt(Integer::intValue).toArray();
    }
}
