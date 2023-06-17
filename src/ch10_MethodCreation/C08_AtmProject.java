package ch10_MethodCreation;

import java.util.Scanner;

public class C08_AtmProject {
    static Scanner input = new Scanner(System.in);
    static String password = "1234a";
    static double bakiye = 10000.25;
    static int count = 3;

    public static void main(String[] args) {
        //basit bir atm programı yazınız
        //switch case, method creatian ve diğer konuları kullanarakyazınız
        sifrekontrol();

    }//main menü

    private static void sifrekontrol() {
        System.out.println("**********************");
        System.out.println("****Bankamıza Hoşgeldiniz");
        System.out.println("Hoşgeldiniz şifrenizi giriniz ");
        String sifre = input.nextLine();

        while (count > 0) {//
            if (sifre.equals(password)) {
                anaMenu();//şifre doğru ise ana menuye yönlendir
                break;
            } else {
                System.out.println("şifre tekrar deneyiniz");
                sifre = input.nextLine();
                count--;
            }
            if (count == 0) {
                System.out.println("kart bloka oldu");
                break;
            }

        }
    }


    private static void anaMenu() {
        System.out.println("Bakiye sorgulama içi 1\nPara yatırma için 2\nPara çekme için 3\n" + "çıkış için 4 e basınız");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                bakiyesorgulama();
                anaMenu();
                break;
            case 2:
                parayatir();
                anaMenu();
                break;
            case 3:
                paraCekme();
                anaMenu();
                break;
            case 4:
                System.out.println("işleminiz bitmiştir");

                //  cikis();
                break;

            default:
                System.out.println("hatalı seçim");
                anaMenu();
                break;
        }
    }

  //  private static void cikis() {
    //    System.out.println("işleminiz bitmiştir");

  //  }

    private static void paraCekme() {
        System.out.println("güncel bakiye= " + bakiye);

        System.out.println("ne kadar para çekmek istersiniz: ");
        int cekilenPara = input.nextInt();
        if (bakiye >= cekilenPara) {
            bakiye -= cekilenPara;
            System.out.println("güncel bakiyeniz:" + bakiye);


        } else {
            System.out.println("yetersiz bakiye tekrar deneyiniz  ");
            System.out.println("denemek için 1 e\nana menüye dönmek için 2 basınız:");
            int tercih = input.nextInt();
            do {

                switch (tercih) {
                    case 1:
                        paraCekme();
                       // System.out.println("güncel bakiyeniz:" + bakiye);
                        anaMenu();
                        break;
                    case 2:
                        anaMenu();
                        break;
                    default:
                        // System.out.println("");
                        System.out.println("denemek için 1 e\nana menüye dönmek için 2 basınız:");
                        tercih = input.nextInt();
                        break;
                }
            } while (!(tercih == 1 || tercih == 2));
        }
    }

    private static void parayatir() {

        System.out.println("ne kadar para yatırmak istersiniz: ");
        int girilenPara = input.nextInt();
        bakiye += girilenPara;
        System.out.println("güncel bakiye=" + bakiye);
    }

    private static void bakiyesorgulama() {
        System.out.println("güncel bakiye= " + bakiye);
    }
}//class sonu
