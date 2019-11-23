package DateAndTimeEx;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Exercise3 {
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now ();
        LocalDate acumZeceZile;
        LocalDate dupaZeceZile;


        acumZeceZile = astazi.minus (10, DAYS);
        dupaZeceZile = astazi.plus (10,DAYS);

        acumZeceZile = acumZeceZile.minusDays (10);
        dupaZeceZile = dupaZeceZile.minusDays (10);


        System.out.println (astazi);
        System.out.println (acumZeceZile);
        System.out.println (dupaZeceZile);



    }
}
