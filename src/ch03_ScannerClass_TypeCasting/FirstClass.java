package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);//1. adım
       //System.out.println("şifreni gir=");//2. adım
       //String sifre=input.nextLine();//3. adım
       //System.out.println(sifre.replaceAll("\\d","*"));//****rty
       //System.out.println(sifre.replaceAll("\\D","*"));//123***
//task kullanıcının girdiği degere göre kare alma ve cevre
        //System.out.println("karenin kenarını giriniz ");//kullanıcının girdigi kenar
        //int kenar=input.nextInt()5;
        //int alan=kenar*kenar;// kenarı carparak alan variable ına atandı
        //int cevre= kenar*4;// kenarı 4 ile çarparak cevreyi bulduk
//
        //System.out.println("alan="+alan);
        //System.out.println("cevre="+cevre);

        //task2

        //System.out.println("Gunluk cay sayını giriniz ");
        //int caysayisi=input.nextInt();
        //System.out.println("caya kaç seker atarsınız ");
        //int sekersayisi= input.nextInt();
        //System.out.println("yılda icdiğin çay saati="+(caysayisi*360));
        //System.out.println("yılda tukettiğin şeker fiyatı="+(caysayisi*((sekersayisi*1.7)*365))/1000);
//task3 kullanıcıdan ismini alıp ilkharfini yazdırılacak
        System.out.println("isminizi giriniz=");
        String name=input.nextLine();//ismin tamamını alıpnme atanacak
        System.out.println("name="+name);
        char ilkhaarf=name.charAt(0);//kullanıının girdiği ismin girdiği ilk harfi atadı

        System.out.println("ilk harf="+ ilkhaarf);

        System.out.println("name.length()="+name.length());
//task4 son harfi yazdırınız
     char sonharf=name.charAt(name.length() - 1);//ismin son harfinin atanması yapıldı
        System.out.println("son farf ="+sonharf);

    }
}
