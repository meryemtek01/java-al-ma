package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
girilen bir yılın artık (LEAP YEAR) subat 29 mu olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece
    400’ün katı olan yıllar artık yıldır.
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl giriniz:");
        int yıl= input.nextInt();
        if ((yıl%4==0)&& (yıl % 100 !=0)|| (yıl%400==0)) {//birinci false olursa tekrar kontrol edip ikinci true aldığı zaman sarti saglayacak yoksa 400 ü 800 ü kaçırır
            System.out.println("girdigin yıl "+yıl+" artık yıldır");
        }else {
            System.out.println("girdiğin yıl "+yıl+"artık yıl değildir");
        }
        String result = (yıl % 4 == 0 && yıl % 100 != 0) || (yıl % 400 == 0) ? "Artık yıl" : "Artık yıl değil";
        System.out.println("result  "+ result);


    }
}
