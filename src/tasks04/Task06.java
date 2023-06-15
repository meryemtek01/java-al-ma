package tasks04;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */

        Scanner input = new Scanner(System.in);
        System.out.print("3 basamaklı sayi giriniz ");
        int sayi = input.nextInt();
        int birlerbasamagi = sayi % 10;
        System.out.println("birler basamagı " + birlerbasamagi);

        sayi /= 10;

        int onlarbasamagi = sayi % 10;
        System.out.println("onlar basamagi " + onlarbasamagi);
        int yuzlerbasamagi = sayi / 10;
        System.out.println("yüzler basamagi " + yuzlerbasamagi);
//2.yol
        System.out.print("3 basamaklı sayi giriniz ");
        int sayi1 = input.nextInt();
        birlerbasamagi=sayi1%10;
        onlarbasamagi=(sayi1/10)%10;
        yuzlerbasamagi=(sayi1/100);
        System.out.println("birler basamagı"+birlerbasamagi+"\nonlar basamagi "+onlarbasamagi+"\nyüzler basamagi "+yuzlerbasamagi);

    }
}
