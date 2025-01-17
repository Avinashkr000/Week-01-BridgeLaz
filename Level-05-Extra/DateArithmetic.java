import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public static void OPDateArithmetic(String inputDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date = LocalDate.parse(inputDate, formatter);

    // Adding 7 days, 1 month, and 2 years
    LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

    // Subtracting 3 weeks
    LocalDate resultDate = updatedDate.minusWeeks(3);

    System.out.println(STR."Original Date : \{date}");
    System.out.println(STR."Updated Date After Additions : \{updatedDate}");
    System.out.println(STR."Final Date After Subtraction : \{resultDate}");
}
public static void main (String[] args) {
    OPDateArithmetic("2023-01-01"); // Example date input
}