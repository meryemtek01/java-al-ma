package halukh_taskÇalışma.Challange05;

public class Q01_ForLoop {
    /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13
         toplam =364
         */

    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 100; i > 0; i--) {

            if (i % 13 == 0) {//döngüden gelen her bir sayı 13'e tam bölünme şartı
                System.out.println(i);
                toplam += i; //13 e tambölünen döngü sayıları toplama eklendi
            }

        }
        System.out.println("13 e tam bölünen sayı toplam  "+toplam);
    }
}
