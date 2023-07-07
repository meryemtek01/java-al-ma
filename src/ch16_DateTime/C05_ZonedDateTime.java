package ch16_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C05_ZonedDateTime {
    public static void main(String[] args) {
        //
        LocalDate tarihZoned=LocalDate.now(ZoneId.of("UTC"));
        System.out.println("tarihZoned = " + tarihZoned);

    }
}
