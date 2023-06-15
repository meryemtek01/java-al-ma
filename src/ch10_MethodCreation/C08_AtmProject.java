package ch10_MethodCreation;

import java.util.Scanner;

public class C08_AtmProject {
    static Scanner input=new Scanner(System.in);
    static String password="1234a";
    static double bakiye=10000.25;
    static int count=3;

    public static void main(String[] args) {
        //basit bir atm programı yazınız
        //switch case, method creatian ve diğer konuları kullanarakyazınız
       sifrekontrol();

    }

    private static void sifrekontrol() {
        System.out.println("**********************");
        System.out.println("****Bankamıza Hoşgeldiniz");
        System.out.println("Hoşgeldiniz şifrenizi giriniz ");
        String sifre= input.nextLine();

        while (count>0) {//
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
        System.out.println("Bakiye sorgulama içi 1\nPara yatırma için 2\nPara çekme için 3\n"+"çıkış için 4 e basınız");
        int secim= input.nextInt();
        switch (secim){
            case 1:
                //bakiyesorgulama();
                anaMenu();
                break;
            case 2:
                //parayatir();
                anaMenu();
                break;
            case 3:
                anaMenu();
                break;
            case 4:
                break;


        }
    }
    }
