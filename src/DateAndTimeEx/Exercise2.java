package DateAndTimeEx;

import java.time.LocalDate;
import java.time.Month;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        Month lunaCorespunzatoareZileiDeAzi = astazi.getMonth ();
        int numarDeZile = lunaCorespunzatoareZileiDeAzi.length (false);
        System.out.println(numarDeZile);
        // System.out.println (astazi.getMonth ().maxLength ());  - metoda 2

    }
}
