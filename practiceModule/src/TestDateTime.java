import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class TestDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LinkedList<String> startDates = new LinkedList<>();
        LinkedList<String> endDates = new LinkedList<>();

//        System.out.println("date = " + date);
//        System.out.println("date.getMonthValue() = " + date.getMonthValue());

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 21; j++) {
                startDates.add(LocalDate.of(2022, i, j) + " 00:00");
                System.out.println("LocalDate.of(2022, i, j) = " + LocalDate.of(2022, i, j) + " 00:00");
            }
        }



        for (int i = 1; i < 13; i++) {
            for (int j = 6; j < 26; j++) {
                endDates.add(LocalDate.of(2022, i, j) + " 00:00");
                System.out.println("LocalDate.of(2022, i, j) = " + LocalDate.of(2022, i, j) + " 00:00");
            }
        }
//        System.out.println("startDates.size() = " + startDates.size());
//        System.out.println("endDates.size() = " + endDates.size());
//
//        System.out.println("startDates.get(0) = " + startDates.get(0));
//        System.out.println("endDates.get(0) = " + endDates.get(0));

        int dateIdx = 0;
        for (int i = 0; i < 300; i++) {
            VO vo = new VO();

            if (dateIdx < startDates.size()) {
                vo.setStartDate(startDates.get(dateIdx));
                vo.setEndDate(endDates.get(dateIdx));
                vo.setCloseDate(endDates.get(dateIdx));
                dateIdx++;
            } else if (dateIdx >= startDates.size()) {
                dateIdx = 0;
                vo.setStartDate(startDates.get(dateIdx));
                vo.setEndDate(endDates.get(dateIdx));
                vo.setCloseDate(endDates.get(dateIdx));
            }
            System.out.println(i + " 번째 vo");
            System.out.println(vo);
        }



    }
}
