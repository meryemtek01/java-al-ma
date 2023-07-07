package ch16_DateTime;

import java.time.LocalTime;
import java.util.Locale;

public class C02_LocalDatetime {
    public static void main(String[] args) {



        //for loop ile hız testi
        LocalTime forloopbasi=LocalTime.now();
        System.out.println("forloop.getNano() = " + forloopbasi.getNano());

        int toplam=0;
        for (int i = 0; i < 100000; i++) {
            toplam+=i;


        }
        System.out.println("toplam = " + toplam);
        LocalTime forloopsonu=LocalTime.now();

        System.out.println("forloopsonu.getNano() = " + forloopsonu.getNano());
        System.out.println("fark nanos = " + (forloopsonu.getNano()-forloopbasi.getNano()));


    }
}
