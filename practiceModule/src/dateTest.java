import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTest {

    public static void main(String[] args) {

        
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDate localDate = now.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalDateTime date1 = LocalDateTime.of(2024, 3, 26, 1, 12, 0);

        System.out.println(date1.toLocalDate().isEqual(localDate));

        String yyMMdd = date1.format(DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println("yyMMdd = " + yyMMdd);

    }
}
