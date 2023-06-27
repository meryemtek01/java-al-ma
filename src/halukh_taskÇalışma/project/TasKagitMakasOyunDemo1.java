package halukh_taskÇalışma.project;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasOyunDemo1 {
    public static void main(String[] args) {


        System.out.println("\"************************* OYUNA HOŞ GELDİNİZ *****************************\"");
        System.out.println("\"SCOREBOARD\"");
        int kullaniciPuan = 0;
        int bilgisayarPuan = 0;

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("\"SEÇİM PANOSU\"");

        System.out.println("TAŞ (1), KAĞIT (2) veya MAKAS (3) seçin. Çıkmak için '0' girin.");

        while (true) {
            System.out.print("SEÇİMİNİZİ YAPIN: ");
            int kullaniciSecimi = scanner.nextInt();

            if (kullaniciSecimi == 0) {
                break;
            }

            if (kullaniciSecimi < 1 || kullaniciSecimi > 3) {
                System.out.println("GEÇERSİZ SEÇİM! LÜTFEN ADAM GİBİ SEÇİM YAP.");
                continue;
            }

            int bilgisayarinSecimi = rnd.nextInt(3) + 1;

            System.out.println("BİLGİSAYAR SEÇİMİ: " + bilgisayarinSecimi);

            if (kullaniciSecimi == bilgisayarinSecimi) {
                System.out.println("BERABER KALDINIZ!");
            } else if ((kullaniciSecimi == 1 && bilgisayarinSecimi == 3) ||
                    (kullaniciSecimi == 2 && bilgisayarinSecimi == 1) ||
                    (kullaniciSecimi == 3 && bilgisayarinSecimi == 2)) {
                System.out.println("KULLANICI KAZANDI!");
                kullaniciPuan += 1;
            } else {
                System.out.println("BİLGİSYAR KAZANDI!");
                bilgisayarPuan += 1;
            }
        }

        System.out.println("SONUÇLAR:");
        System.out.println("KULLANICI PUANI: " + kullaniciPuan);
        System.out.println("BİLGİSAYARIN PUANI: " + bilgisayarPuan);
    }
}



