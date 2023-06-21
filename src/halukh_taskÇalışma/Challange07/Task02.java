package halukh_taskÇalışma.Challange07;

import java.util.Scanner;

public class Task02 {

		// task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Agam bir sayı giriniz : ");
        int sayi = input.nextInt();
        System.out.println(tekCiftControlEt(sayi));
        System.out.println(tekCiftControlEt1(sayi));



    }//main sonu

    public static String tekCiftControlEt1(int sayi) {
        return sayi%2 == 0 ?"girilen sayı cift ":"girilen sayı tek";
    }

    private static boolean tekCiftControlEt(int sayi) {
        return sayi%2 ==0 ? true : false;

    }

}//class sonu




