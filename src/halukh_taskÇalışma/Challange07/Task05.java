package halukh_taskÇalışma.Challange07;

import java.util.Scanner;

public class Task05 {
    static Scanner sc = new Scanner(System.in);
    // task->
    //Kullaniciya kac sayi toplamak istedigini sorun.
    //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
    //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
    //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam kaç  sayı gireceksiniz : ");
        int sayiAdedi = input.nextInt();
        if (sayiAdedi<2){
            System.out.println("en az 2 sayi giriniz");
        } else if (sayiAdedi==2) {
            System.out.println("1.  sayi giriniz");
            int sayi1=input.nextInt();

            System.out.println("2.  sayi giriniz");
            int sayi2=input.nextInt();
            System.out.println("sayiTopla(sayi1,sayi2) = " + sayiTopla(sayi1, sayi2));

        } else if (sayiAdedi==3) {
            System.out.println("1.  sayi giriniz");
            int sayi1=input.nextInt();

            System.out.println("2.  sayi giriniz");
            int sayi2=input.nextInt();
            System.out.println("3.  sayi giriniz");
            int sayi3=input.nextInt();
            System.out.println("sayiTopla(sayi1,sayi2,sayi3) = " + sayiTopla(sayi1, sayi2, sayi3));

        }else if (sayiAdedi==4) {
            System.out.println("1.  sayi giriniz");
            int sayi1=input.nextInt();

            System.out.println("2.  sayi giriniz");
            int sayi2=input.nextInt();
            System.out.println("3.  sayi giriniz");
            int sayi3=input.nextInt();
            System.out.println("4.  sayi giriniz");
            int sayi4=input.nextInt();
            System.out.println("sayiTopla(sayi1,sayi2,sayi3,sayi4) = " + sayiTopla(sayi1, sayi2, sayi3, sayi4));

        }else System.out.println("çok sayi giriniz ben toplayamam ");


    }//main sonu

    private static int sayiTopla(int sayi1, int sayi2, int sayi3, int sayi4) {
        return (sayi1+sayi2+sayi3+sayi4);
    }
    private static int sayiTopla(int sayi1, int sayi2, int sayi3) {
        return (sayi1+sayi2+sayi3);
    }
    private static int sayiTopla(int sayi1, int sayi2) {
        return (sayi1+sayi2);
    }
}//class sonu
