package DateAndTimeEx;

import java.time.LocalDate;

public class Exercise5 {
    public static void main(String[] args) {
        LocalDate azi = LocalDate.now ();
        int totalLuni = 12;
        int luniRamase = totalLuni - azi.getMonthValue ();

        System.out.println (luniRamase);
    }
}
