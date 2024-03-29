import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list3 = Arrays.asList(1, 2, 3);
        List<Integer> list4 = Arrays.asList(3, 4, 5);


        List<Integer> emptyList = new ArrayList<>();

        // 1. 파라미터가 Empty
        List<Integer> resultList1 = emptyList.stream()
                .filter(old -> list2.stream().noneMatch(Predicate.isEqual(old)))
                .collect(Collectors.toList());

        System.out.println("resultList1 = " + resultList1);

        // 2. 데이터가 Empty
        List<Integer> resultList2 = list1.stream()
                .filter(old -> emptyList.stream().noneMatch(Predicate.isEqual(old)))
                .collect(Collectors.toList());

        System.out.println("resultList2 = " + resultList2);

        System.out.println("list1.containsAll(list3) : " + list1.containsAll(list3));
        System.out.println("list2.containsAll(list3) : " + list2.containsAll(list3));

        System.out.println("list1.equals(list3) : " + list1.equals(list3));
        System.out.println("list2.equals(list3) : " + list2.equals(list3));

        System.out.println("list3.containsAll(list4) : " + list3.containsAll(list4));

        List<Integer> resultList3 = list3.stream()
                .filter(old -> emptyList.stream().anyMatch(Predicate.isEqual(old)))
                .collect(Collectors.toList());

        System.out.println("resultList3 = " + resultList3);
    }
}
