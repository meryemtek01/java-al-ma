package tasks04;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kaç saniye üzerinden işlem yapalım?");
        int saniye = girdi.nextInt();
        int dakika = saniye / 60;
        int saat = dakika / 60;

        dakika = dakika % 60;
        saniye = saniye % 60;

        System.out.printf("%02d:%02d:%02d", saat, dakika, saniye);
        System.out.println("\nsaat: "+saat+"dakika: "+dakika+"saniye:"+saniye);
    }
}
