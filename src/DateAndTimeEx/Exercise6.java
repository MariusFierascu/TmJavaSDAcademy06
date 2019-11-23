package DateAndTimeEx;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println ("Year: ");
        Scanner in = new Scanner (System.in);
        String year = in.nextLine ();

        System.out.println ("Month: ");
        String month = in.nextLine ();

        System.out.println ("Day: ");
        String day = in.nextLine ();

        System.out.println (year + " " + month + " " + day);
        LocalDate aDate;
        aDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        System.out.println (aDate);
    }
}
