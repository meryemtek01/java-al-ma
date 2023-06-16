package ch10_MethodCreation;

import java.util.Scanner;

public class C09_UcusFurkanB {
    public static void main(String[] args) {

        int yol=0;
        double yas=0, yon=0;
        Scanner input = new Scanner(System.in);

        System.out.println("JAVA HAVAYOLLARINA HOŞGELDİNİZ.\nB  C  D  rotalarından hangisine gideceksiniz ?");
        String secimRota = input.next().toUpperCase();

        switch (secimRota) {
            case "B":
                yol = 500;
                break;
            case "C":
                yol = 700;
                break;
            case "D":
                yol = 900;
                break;
        }

        System.out.println("Yaşınız 12 den küçük ise 1 i\n12 ile 24 arası ise  2 yi \n24 ile 65 arası ise  3 ü" +
                "\n65 üstü ise 4 ü\n******* tuşlayınız ******");
        int secimYas=input.nextInt();
        switch (secimYas) {
            case 1:
                yas = 0.5;
                break;
            case 2:
                yas = 0.9;
                break;
            case 3:
                yas = 1;
                break;
            case 4:
                yas = 0.7;
                break;
        }
        System.out.println("Gidiş--Dönüş biletlerde % 20 indirim yapılmaktadır");
        System.out.println("Uçuşunuz tek yön ise 1 i\ngidiş-dönüş ise  2 yi \n******* tuşlayınız ******");
        int secimYon=input.nextInt();

        switch (secimYon) {
            case 1:
                yon = 1;
                break;
            case 2:
                yon = (2 * 0.8);
                break;
        }

        System.out.println("Bilet fiyatınız ="+(yol*yas*yon*0.1)+" $");



    }//main menü





}//class sonu
