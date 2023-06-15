package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("yaşınızı giriniz:");
        int yas= input.nextInt();
        if (yas>=18) {//yasın 18 den büyük olup plmadıgı kontrol edildi
            System.out.println("ehliyet alama şansınız var");
        } else {//yukarıda şarttan sonra else yaş 18 den küçük ise çalışır
            System.out.println("ehliyet alamazsınız");
        }


    }
}
