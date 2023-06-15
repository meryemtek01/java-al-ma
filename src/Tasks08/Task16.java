package Tasks08;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("agam bir sayi giresen : ");

        int sayi = input.nextInt();
        int bolenSayisi = 0;//boş bir int kutu tanımlandı

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                bolenSayisi++;
            }
        }

        if (bolenSayisi == 0) {
            System.out.println("girirlen sayi ASALdır");
        } else {
            System.out.println("girlen sayı ASAL DEĞİL ");
        }
        // cozum 2
        boolean sayiAsaldir = true;
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                sayiAsaldir = false;
            }
        }
        if (sayiAsaldir) System.out.println("girirlen sayi ASALdır");
         else System.out.println("girlen sayı ASAL DEĞİL ");

    }
}
