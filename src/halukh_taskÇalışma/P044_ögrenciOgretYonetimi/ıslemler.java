package halukh_taskÇalışma.P044_ögrenciOgretYonetimi;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ıslemler {

    static List<Ogretmen> ogretmenList = new ArrayList<Ogretmen>();
    static List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
    static String kisiTuru;
    static Scanner input = new Scanner(System.in);
    //static Scanner inputLine = new Scanner(System.in); //dummy yerine kullanılır

    public static void girisPaneli() {
        System.out.println("**********************************      \nOGRENCI VE OGRETMEN ANA MENU \n**********************************\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS \nLutfen yapmak istediginiz islemi giriniz : ");

        //String secim=input.next();
        //  switch (secim) {
        switch (input.next().toUpperCase()) {
            case "1":
                kisiTuru = "ögrenci";//kişi turu ögrenci atandı
                islemMenu();
                break;
            case "2":
                kisiTuru = "ögretmen";
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar giriniz ");
                girisPaneli();
                break;
        }
    }

    private static void cikis() {
        System.out.println(" tekrar bekleriz ");
    }

    private static void islemMenu() {
        System.out.println("Sectiginiz kisi turu: " + kisiTuru + " ISLEM MENU , Lutfen asagidaki islemlerden tercih yapiniz.\n"
                + "*********** " + kisiTuru + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                "Islem Tercihinizi giriniz : ");
        int secim = input.nextInt();
        switch (secim) {

            case 0:
                girisPaneli();
                break;
            case 1:
                ekle();
              //  islemMenu();
                break;
            case 2:
                Ara();
                islemMenu();
                break;
            case 3:
                litele();
                break;
            case 4:
                sil();
                islemMenu();
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz...");
                islemMenu();//recursive meth.
                break;


        }

    }

    private static void sil() {
        System.out.println(" ****   "+kisiTuru+"  Sile sayfası  ***  ");
        if (kisiTuru.equalsIgnoreCase("ögrenci")){
            System.out.println("Aranan öğrenci KimlikNo giriniz : ");
            String arananOgrcKimlikNo = input.nextLine();
            for (Ogrenci  k:ogrenciList) {
                if (k.getKimlikNo().equals(arananOgrcKimlikNo)){
                    ogrenciList.remove(k);//oğrenciKimlik nosu listede olan öğrc list'ten silindi
                    System.out.println("öğrenciniz  başarı ile silinmiştir.");
                    break;
                } else System.out.println("silinecek öğrenci listemizde mevcut değil ");
            }
            System.out.println("öğrenciniz işleminiz başarı ile yapılmıştır. \n" +
                    "OGRENCI ISLEM MENU'ye yönlendiriliyorsunuz");
            islemMenu();


        }else {System.out.println("Aranan öğretmen KimlikNo giriniz : ");
            String arananOgretmenKimlikNo = input.nextLine();
            for (Ogretmen  k:ogretmenList) {
                if (k.getKimlikNo().equals(arananOgretmenKimlikNo)){
                    ogretmenList.remove(k);//oğrenciKimlik nosu listede olan öğrc list'ten silindi
                    System.out.println("öğretmen  başarı ile silinmiştir.");
                    break;
                } else System.out.println("silinecek öğretmen listemizde mevcut değil ");
            }
            System.out.println("öğretmen işleminiz başarı ile yapılmıştır. \n" +
                    "öğretmen ISLEM MENU'ye yönlendiriliyorsunuz");
            islemMenu();
            }







    }

    private static void litele() {
        System.out.println(" ****   "+kisiTuru+"  listeleme sayfası  ***  ");
        if (kisiTuru.equalsIgnoreCase("ögrenci")){
            System.out.println(ogrenciList);


        }else {
            System.out.println(ogretmenList);

        }

        islemMenu();

    }

    private static void Ara() {
        System.out.println(" ****   "+kisiTuru+"  Arama sayfası  ***  ");
        if (kisiTuru.equalsIgnoreCase("ögrenci")){
            System.out.println("Aranan öğrenci KimlikNo giriniz : ");
            String arananOgrcKimlikNo = input.nextLine();
            for (Ogrenci  k:ogrenciList) {
                if (k.getKimlikNo().equals(arananOgrcKimlikNo)){
                    System.out.println("Aradığınız öğrenci : " + k.getAd_soyad()+ " listemizde mevcut");
                    break;
                }
                 else System.out.println("Aradığınız öğrenci : "+(k.arananOgrcKimlikNo)+ " listemizde mevcut değil") ;{
                }


            }


        }else System.out.println("Aranan öğretmen KimlikNo giriniz : ");{
            input.nextLine();//dummy
            String arananOgretmenKimlikNo = input.nextLine();
            for (Ogretmen  k:ogretmenList) {
                if (k.getKimlikNo().equals(arananOgretmenKimlikNo)){
                    System.out.println("Aradığınız öğretmen : " + k.getAd_soyad()+ " listemizde mevcut");
                    break;
                }
                else System.out.println("Aradığınız öğretmen : "+(k.arananOgretmenKimlikNo)+ " listemizde mevcut değil"); {
                }
            }

        }

        islemMenu();

    }

    private static void ekle() {
        System.out.println(" ****   "+kisiTuru+"  ekleme sayfası  ***  ");
        if (kisiTuru.equalsIgnoreCase("ögrenci")){
            System.out.println("ögrenci ad soyad giriniz:");
            String ad_soyad= new  Scanner(System.in).nextLine();

            System.out.println("ögrenci kimlik no giriniz:");
            String kimlikNo= input.next();
           // input.next();//dummy

            System.out.println("ögrenci yas giriniz:");
           int yas= input.nextInt();

            System.out.println("ögrenci  no giriniz:");
            String No= input.next();

            System.out.println("ögrenci sınıf giriniz:");
            String sinif= input.next();
            Ogrenci ogrobj=new Ogrenci(ad_soyad,kimlikNo,yas,No,sinif);
            ogrenciList.add(ogrobj);//ogrc obj ogrenciList'e eklendi

            System.out.println("öğrenciniz " + ogrobj.getAd_soyad() + " başarı ile eklenmiştir. \n" +
                    "OGRENCI ISLEM MENU'ye yönlendiriliyorsunuz");



        }else {
            System.out.println("Öğretmen ad soyad giriniz:");
            String ad_soyad= new  Scanner(System.in).nextLine();

            System.out.println("Öğretmen kimlik no giriniz:");
            String kimlikNo= input.next();
            // input.next();//dummy

            System.out.println("Öğretmen yas giriniz:");
            int yas= input.nextInt();

            System.out.println("Öğretmen sicilno giriniz:");
            String sicilNo= input.next();

            System.out.println("Öğretmen bölüm giriniz:");
            String bolum= input.next();

           Ogretmen ogretmenobj=new Ogretmen(ad_soyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmenobj);//ogrc obj ogrenciList'e eklendi

            System.out.println("Öğretmen " + ogretmenobj.getAd_soyad() + " başarı ile eklenmiştir. \n" +
                    "Öğretmen ISLEM MENU'ye yönlendiriliyorsunuz");

        }

        islemMenu();

    }


}
