package ch16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class Task01 {
    public static void main(String[] args) {
// task-> 2.5.2023 de (5.ayin 2 i) başlayan kurs 9 ay olduguna göre bitiş tarihini print eden code create ediniz

        LocalDate baslangic = LocalDate.of(2023, 5, 2);
        System.out.println("başlangic = " + baslangic);
        Period period=Period.ofMonths(9);

        System.out.println("başlangic.plus(period) = " + baslangic.plus(period));
//başlangic.plus(period) = 2024-02-02 işe başlama tarihi

    }
}
