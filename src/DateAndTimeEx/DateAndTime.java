package DateAndTimeEx;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class DateAndTime {
    public static void main(String[] args) {

        LocalDate acum = LocalDate.now();
        System.out.println(acum);
        System.out.println();
        LocalDateTime acumCuTimp = LocalDateTime.now();
        System.out.println(acumCuTimp);
        System.out.println();
        Instant chiarAcum = Instant.now();
        System.out.println(chiarAcum);
        System.out.println(Instant.EPOCH);
        System.out.println();
        ZonedDateTime acumCuFus = ZonedDateTime.now();
        System.out.println(acumCuFus);


    }
}
