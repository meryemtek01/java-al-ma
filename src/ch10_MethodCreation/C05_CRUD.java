package ch10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD {

    //karşılama method u yazılacak
    //biz burada methodlar create edecegiz
    //buradaki methodları Runner class ve switch clss dan çalıştıracagız
    //buradaki methodlar ihtiyaç olduunda istenen yerden call edilebiliri
    //bu methodlar call edeceginiz yerden main net olmalı

    static Scanner input = new java.util.Scanner(System.in);
    static  String staticusername = " ";//kullanıcıdan alınan user name i kayıt etmek için create edildi
    public static void createUser(){
        System.out.println("user name gir ");
        String userName= input.nextLine();
        staticusername=userName;//kullanıcının girdigi user name bizde static olan varıable atandı
        //çunku aşagıdakı methodlar kullanıcı kontrolu yapılıp true ise işleme alınacak

        System.out.println("create edilen userName="+userName);
        System.out.println(userName+"isimli kullanıcı sisteme kayıt oldu");
    }
    public static void getUser(){// kullanıcı isim girmeli bu isme göre bir kontrol yapılıp kullanıcıya true false dönmeli
        System.out.println("sorgulamak istediğin user name gir ");
        String userName= input.nextLine();
        if (userName.equals(staticusername)){
            System.out.println(userName+"isimli kullanıcı sıstemde mevcut ");

        }else System.out.println(userName+"isimli kullanıcı sistemde mevcut DEGİL 404 not found");

    }
    public static void updateUser(){// burada kullanıcı kendi ismini update edcek
        System.out.println("suan kimevcut ismini  "+staticusername);
        System.out.println("yeni isminizi giriniz");
        String yeniİsim=input.nextLine();
        staticusername=yeniİsim;
        System.out.println("isim güncelleme basarılı 200 ok ");
        System.out.println("yeni isminiz  "+staticusername);


    }
    public static void deletUser() {
        System.out.println("silmek istediğin ismi gir  =");
        String silinecekİsim = input.nextLine();
        if (silinecekİsim.equals(staticusername)) {//kullanıcıdan alınan isim eşit ise sistemin kayıtlı olan staticuser name ise
            System.out.println(staticusername + " isimli kullanııc sistemden silindi");
            staticusername = null;
            System.out.println("slinen isim " + silinecekİsim);
        } else System.out.println(silinecekİsim + "isimli kullanıcı sistemde mevcut DEGİL 404 not found");
    }
    public static void cıkıs(){
        System.out.println("cıkış yaptınız yine bekleriz");



    }

}
