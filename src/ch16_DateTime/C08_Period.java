package ch16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {
        //iki tarih arasındaki zamanı tutar

        LocalDate bugun=LocalDate.now();
        LocalDate birtday=LocalDate.of(1976,11,02);

        Period fark=Period.between(bugun, birtday);

        System.out.println("fark = " + fark);//ffark = P-46Y-8M-4D
        System.out.println("bugun.compareTo(birtday) = " + bugun.compareTo(birtday));


    }
}
