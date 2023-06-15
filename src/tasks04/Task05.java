package tasks04;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);//1. adim
        //System.out.println("bir saat giriniz  ");
        //int count = input.nextInt();
        //System.out.println("girilen saat " + count);
        //int saniye = count * 3600;
        //System.out.println("saatin saniye cinsinden= " + saniye);

        Scanner input = new Scanner(System.in);

        System.out.println(" bir saat girin");

        int saat = input.nextInt();

        System.out.println("dakika girin");

        int dk = input.nextInt();

        System.out.println("saniye girin");

        int sn = input.nextInt();
        int toplamSaniye = saat * 3600 + dk * 60 + sn;
        System.out.println("toplam saniye = " + toplamSaniye);

    }

}
