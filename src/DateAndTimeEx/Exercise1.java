package DateAndTimeEx;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        DayOfWeek dayOfWeekweek =astazi.getDayOfWeek();
        System.out.println(dayOfWeekweek);
    }
}
