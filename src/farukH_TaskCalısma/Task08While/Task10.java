package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi = oku.nextInt();

        while (sayi > 0) {
            if (sayi % 2 == 1) {
                System.out.println("sayi = " + sayi);
            }

            sayi--; // sayi=sayi-1;
        }
        // veya önce sayıyı tek teğilse 1 eksilt sonra sormadan topla ve sayiyi ikişer eksit


    }
}
