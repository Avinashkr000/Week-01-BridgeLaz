package Extra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("YYYY/MM/DD");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("EEE, MMM DD,YYYY");
        System.out.println(dt.format(df));
        System.out.println(dt.format(df2));
        System.out.println(dt.format(df3));

    }
}
