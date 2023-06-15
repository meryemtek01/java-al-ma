package halukh_taskÇalışma.task04Solutions;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /* Soru
         * Kullanicinin girdigi 3 basamakli sayinin birler ve yüzler rakamlarinin toplamini veren programi yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Üç basamaklı sayı ? : "); int sayi = input.nextInt();
        // 346
        int birlerBasamagi  = sayi%10;
        int yuzlerBasamagi  = sayi / 100 ;
        System.out.println((birlerBasamagi+yuzlerBasamagi));


    }
}
