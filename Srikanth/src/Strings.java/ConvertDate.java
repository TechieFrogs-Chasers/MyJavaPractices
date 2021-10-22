import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.String;

public class ConvertDate {

    private static final CharSequence String = null;

    public static void main(String[] args) {
        String string = "October 22,2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm date,year", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(String, formatter);

        System.out.println(date);
    }
}
