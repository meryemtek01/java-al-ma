package halukh_taskÇalışma.project02;

import java.util.Scanner;

public class Task04_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        double yukseklik = input.nextDouble();
        double topunToplamYolu = 0;
        int yereVurmaSayisi = 0;

        int atisYuksekligi = 10; // Topun atıldığı yükseklik (örnek olarak 10 olarak varsayalım)

        double ziplamaYuksekligi = atisYuksekligi; // İlk zıplama yüksekliği atış yüksekliğiyle başlar

        double toplamYol = 0; // Toplam yol

        int vurmaSayisi = 0; // Yere vurma sayısı

        do {
            toplamYol += ziplamaYuksekligi; // Toplam yolu güncelle
            ziplamaYuksekligi *= 0.75; // Zıplama yüksekliğini 3/4 oranında azalt

            vurmaSayisi++; // Yere vurma sayısını artır
            toplamYol += ziplamaYuksekligi * 2;
        } while (ziplamaYuksekligi >= 1); // Zıplama yüksekliği 1 metrenin altına indiğinde döngüden çık

        System.out.println("Toplam Yol: " + toplamYol + " metre");
        System.out.println("Yere Vurma Sayısı: " + vurmaSayisi);
    }


}

