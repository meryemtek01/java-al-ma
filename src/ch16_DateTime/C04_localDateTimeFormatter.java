package ch16_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_localDateTimeFormatter {
    public static void main(String[] args) {
/*
format->
        GUN
d : basta 0 varsa 0 yazmadan gun numarasi yazılır
dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi yazar
DDD : yilin kacinci gunu oldugunu yazar
E, EE, EEE : gun isminin ilk 3 harfi
EEEE : gun isminin tamamini

AY (Ay icin M, dakika icin m kullanilir)
M : basta 0 varsa 0 yazmadan ay numarasi yazılır
MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
MMM : Ay isminin ilk 3 harfi yazılır
MMMM : Ay isminin tamami yazılır

YY : yilin son iki rakamini
YYYY : Yilin tamamini yazılır

Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

HH : saatin tamami, tek rakamli saat olursa 02 gibi
H  : tek rakamli saat olursa sadece saati yazar
HH olursa 24 saatlik dilimine gore olur
hh :  12 saat dilimine gore 2 rakam olarak yazılır
h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

m : minute tek rakamlari tek yazlır
mm: tek rakamlari 08 gibi yazılır

a yazarsak AM veya PM degerini yazar


        */
        LocalDateTime ldt= LocalDateTime.now();
        System.out.println("ldt = " + ldt);//ldt = 2023-07-06T20:57:15.414783800 bu çıktı değişir

        //istenene format 02/23/2023
        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("ldt = " + ldt.format(format));//ldt = 2023/07/06

        System.out.println("format = " + format.format(ldt));//format = 2023/07/06

        DateTimeFormatter formatTime= DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("formatTime.format(ldt.plusHours(2)) = " + formatTime.format(ldt.plusHours(2)));
        //formatTime.format(ldt.plusHours(2)) = 11:12:09
        System.out.println("ldt.format(formatTime) = " + ldt.format(formatTime));//ldt.format(formatTime) = 09:12:09

    }
}
