package farukH_TaskCalısma.task10Methots;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();
        sayilarEsitMi(num1,num2);
        sayilarEsitMi(35,42);

        // 2. yol
        boolean sonuc = sayilarEsitMi2(num1,num2);
        if (sonuc) System.out.println("eşittir");
        System.out.println("eşit değildir");
    }//main sonu

    private static boolean sayilarEsitMi2(int num1, int num2) {
        return (num1==num2);
    }

    private static void sayilarEsitMi(int n1, int n2) {
        System.out.print(n1+" ve "+n2);
        if (n1==n2) System.out.println(" sayılar eşittir");
        else System.out.println(" sayılar eşit değildir");
    }


}//class sonu
