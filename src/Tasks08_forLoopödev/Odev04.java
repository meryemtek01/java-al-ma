package Tasks08_forLoopödev;

import java.util.Scanner;

public class Odev04 {

    public static void main(String[] args) {
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        //Scanner input = new Scanner(System.in);
        // System.out.println("3 basamaklı sayi giriniz ");
        //int sayi = input.nextInt();

       Scanner input = new Scanner(System.in);
       System.out.println("bir sayı giriniz");
      int n= input.nextInt();
      // int n=5;
        int sayi= 1;
        for (int i = 1; i <=n; i++) {
            sayi=i;
            //System.out.print(n + " ");
            for (int j = 1; j <= i; j++) {
               System.out.print(sayi+ " ");
                sayi+= n- j;
            }

            System.out.println();//dumy

            /* art bey
             for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            int cikanSayi = 0;
            for (int j = 1; j < i; j++) {
                cikanSayi += j;
                System.out.print(((i + (j * 5)) - cikanSayi)+" ");
            }
            System.out.println();//dumy
             */
        }

    }
}
