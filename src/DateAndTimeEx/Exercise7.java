package DateAndTimeEx;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        LocalDate firstDate = citesteDeLaTastatura();
        LocalDate secondDate = citesteDeLaTastatura();

        System.out.println (firstDate);
        System.out.println (secondDate);
        Period perioada = Period.between (firstDate,secondDate);
        System.out.println (perioada);

    }
    public static   LocalDate citesteDeLaTastatura()
    {
        System.out.println ("Year: ");
        Scanner in = new Scanner (System.in);
        String year = in.nextLine ();

        System.out.println ("Month: ");
        String month = in.nextLine ();

        System.out.println ("Day: ");
        String day = in.nextLine ();

        int yearInIntFormat = Integer.parseInt(year);
        int monthInIntFormat = Integer.parseInt(month);
        int dayInIntFormat = Integer.parseInt(day);

        // System.out.println (year + " " + month + " " + day);
        return LocalDate.of (yearInIntFormat, monthInIntFormat, dayInIntFormat);

    }
}
