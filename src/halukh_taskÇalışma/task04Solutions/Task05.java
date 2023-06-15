package halukh_taskÇalışma.task04Solutions;

import java.util.Scanner;

public class Task05 {
    /*
     * Girilen süreyi (saat,dakika,saniye)  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen saati giriniz : ");
        int saat = scan.nextInt();

        System.out.print("Lütfen dakikayı giriniz : ");
        int dakika = scan.nextInt();

        System.out.print("Lütfen saniyeyi giriniz : ");
        int saniye = scan.nextInt();

        int toplamSaniye = saat * 3600 + dakika * 60 + saniye;
        System.out.print("Toplam saniye : "+ toplamSaniye);
    }
}
