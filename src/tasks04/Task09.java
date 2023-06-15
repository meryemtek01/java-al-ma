package tasks04;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen inek sayısı giriniz: ");
        int inek = input.nextInt();

        System.out.print("lütfen koyun sayısı giriniz: ");
        int koyun= input.nextInt();
        System.out.print("lütfen tavuk sayısı giriniz: ");
        int tavuk= input.nextInt();

        int toplamayak=inek*4+koyun*4+tavuk*2;
        System.out.println("toplam ayak:"+toplamayak);

    }

}
