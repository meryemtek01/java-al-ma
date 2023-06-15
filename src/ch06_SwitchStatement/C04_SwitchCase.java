package ch06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
//break in ozelligini kullanin
//29 subat icin sartlarini hatirlayiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Ay giriniz ");
        int ay = input.nextInt();
        switch (ay) {
            default:
                System.out.println("dogru bir ay numarası giriniz 1 12 arası");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ayda 31 gün icerir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ayda 30 gün içerir");
                break;
            case 2:// iki durum var 28 ve 29 olması
                System.out.println("yılı giriniz");
                int yil = input.nextInt();
                if (yil % 4 == 0) {//if ((yıl%4==0)&& (yıl % 100 !=0)|| (yıl%400==0))
                    System.out.println("ay 29 gün çeker bu yıl "+yil+" yılında");
                } else
                    System.out.println("ay 28 gün çeker");
//System.out.println(yil % 4 == 0 ? "girilen ayda 29 gün vardır" : "girilen ayda 28 gün vardır");
//break; ternur
            break;
            /* yeni surumde
            switch (ay) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(ay + " 31 ceken aylardandir");
            case 4, 6, 9, 11 -> System.out.println(ay + " 30 ceken aylardandir");
            case 2 -> {
                System.out.print("Please enter a year: ");
                int year = sc.nextInt();
                Object subat = (year % 4 == 0) ? ay + " 29 ceker" : ay + " 28 ceker";
                System.out.println(subat);
            }
            default -> System.out.println("tekrar dene");*/

        }
    }
}
