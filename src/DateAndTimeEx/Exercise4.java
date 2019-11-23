package DateAndTimeEx;

import java.time.LocalDateTime;

public class Exercise4 {
    public static void main(String[] args) {
        LocalDateTime astaziAcum = LocalDateTime.now ();
        LocalDateTime raspuns = astaziAcum.plusWeeks(2).plusMinutes (10);

        System.out.println (raspuns);
    }
}
