package halukh_taskÇalışma.Challange02;

import java.util.Scanner;

public class Task02_Modulus {
    public static void main(String[] args) {
        /*
         *  Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.
         *
         *   Ex :
         *   input  : 14531
         *   output : 9
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Gardaş hele  sayı giresen : ");
        int sayi = input.nextInt();

        int ilk2Sayi = sayi / 1000;//14
        int son2Sayi = sayi % 100;//31
        // System.out.println("son2Sayi = " + son2Sayi);
        // System.out.println("ilk2Sayi = " + ilk2Sayi);

        int son2Toplam = (son2Sayi / 10 /*bu işlem 10 abölüm sonucu 3 verir */) + (son2Sayi % 10/*bu işlem 10 a bölüm kalanı  sonucu 1 verir */); // 3+1=4

        int ilk2Toplam = (ilk2Sayi / 10 /*bu işlem 10 a bölüm sonucu 1 verir */) + (ilk2Sayi % 10/*bu işlem 10 a bölüm kalanı  sonucu 4 verir */); // 1+4=5


        System.out.println("girilen sayı ilk2 ve son2 rakam toplamı : "+(ilk2Toplam+son2Toplam));// 9

    }
}
