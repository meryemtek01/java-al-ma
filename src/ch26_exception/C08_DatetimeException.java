package ch26_exception;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DatetimeException {
    public static void main(String[] args) {

        // LocalDate date=LocalDate.of(2023,4,33);
        LocalDate date = null;
        System.out.println("date = " + date);
        //Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 33


        try {
            date = LocalDate.of(2023, 4, 33);
            System.out.println("try sorunsuz çalıştı");

        } catch (DateTimeException e) {
            System.out.println("catch block yakaladı exeption i ay sayısı fazla girdin");
            System.out.println("e.getMessage() = " + e.getMessage());


            //throw new RuntimeException(e);
        }

        System.out.println("sorun cözüldü devam edin");
    }
}
