package ch06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    // data base mantıgınca bankada tutulan şifre creat edin
    static String password="12345";
    public static void main(String[] args) {
         /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
 çıkış işlemlerinin yapıldıgı bir
 şifre kontrolleri yazınız
 ATM app. code create ediniz
 */
        Scanner input = new Scanner(System.in);
        System.out.println("****Java Banka Atm Hoşgeldiniz***");
        System.out.println("şifrenizi giriniz");
        String sifre=input.nextLine();
        if (sifre.equals(password)){
            System.out.println("şifreniz esleşti devam edebilirsiniz");
            System.out.println("Hoş geldiniz.....\nbaşlangıc bakiyesi ögrenme =1\npara yatırma işlemi=2\npara çekme işlemi=3\nçıkış işlemler=4");
            System.out.println("yapmak istediginiz işlem nedir ");
            int islem = input.nextInt();
            int bakiye = 1000;
            switch (islem) {
                case 1:
                    System.out.println("bakiyeniz :" + bakiye);
                    break;
                case 2:
                    System.out.print("yatırmak istediğiniz miktar :");
                    int yatirilanMiktar = input.nextInt();
                    bakiye += yatirilanMiktar;
                    System.out.println("güncel bakiyeniz :" + bakiye);
                    break;
                case 3:
                    System.out.println("çekmek istediğiniz miktar : ");
                    int cekilenMiktar = input.nextInt();
                    if (cekilenMiktar > bakiye) {//bakiye yeterli olup olmadıgını soruyoruz senaryo
                        System.out.println("yetersiz bakiye ");
                        System.out.println("bakiyeniz " + bakiye);
                    } else {
                        bakiye -= cekilenMiktar;
                        System.out.println("çekmek istediğiniz miktar : ");

                        System.out.println("güncel bakiye  :" + bakiye);
                    }
                case 4:
                    System.out.println("çıkış işleminiz gerçekleşti ");
                    break;
                default:
                    System.out.println("hatalı işlem gerçekleştirdiniz lütfen tekrar deneyiniz");
            }
        }else
            System.out.println("hatalı şifre girdiniz 2 hakkın kaldı");
    }
}
