package ch10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreatıon {
    public static void main(String[] args) {
     /*task<< girilen 3 notun ortalamasını hesaplayan method create ediniz.
     1.  kullanım scanner
     2.

      */
        Scanner input=new Scanner(System.in);
        System.out.println("1. notu giriniz ");
        double not1= input.nextDouble();

        System.out.println("2. notu giriniz ");
        double not2= input.nextDouble();

        System.out.println("3. notu giriniz ");
        double not3= input.nextDouble();
        System.out.println("ortalamahesapla(not1,not2,not3) = " + ortalamahesapla(not1, not2, not3));


    }//main sonu
    private static double ortalamahesapla(double not1, double not2, double not3) {
        return (not1+not2+not3)/3;
    }



}
