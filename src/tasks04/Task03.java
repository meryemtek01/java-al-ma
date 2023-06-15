package tasks04;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Soru
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı sayi giriniz ");
        int sayi = input.nextInt();
        int birlerbasamagi = sayi % 10;
        System.out.println("birler basamagı " + birlerbasamagi);
        int birlerbasamagi2 = sayi -sayi/10*10;//2. yontem
        System.out.println("birler basamagı " + birlerbasamagi);

        sayi /= 10;
        System.out.println("sayı " + sayi);
        int onlarbasamagi = sayi % 10;
        System.out.println("onlar basamagi " + onlarbasamagi);

        int yüzlerbasamagi = sayi / 10;
        System.out.println("yüzler basamagi " + yüzlerbasamagi);
        int toplam = birlerbasamagi + yüzlerbasamagi;
        System.out.println("toplam= " + toplam);

    }

}
