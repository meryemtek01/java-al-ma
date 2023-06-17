package ch08_Loops.L02_WhileL00p.Tasks08_whileLoops;

import java.util.Scanner;

public class Task06_sayiBulmaca {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
      //  Scanner scanner = new Scanner(System.in);


       cozumMetot1();
       cozumMetot2();


}//main sonu

    private static void cozumMetot2() {
        int randomSayi = (int) (Math.random() * 100 + 1);  // 1 den 100 e kadar sayı üretilir
        int tahmin = 0;
        int sayac = 0;
        while (randomSayi != tahmin && sayac<10) {
            sayac++;
            System.out.print("Lütfen " + sayac + ". tahmininizi giriniz : ");
            tahmin = scanner.nextInt();
            if (tahmin>randomSayi) System.out.println("Daha küçük bir sayı tahmin ediniz");
            else if (tahmin<randomSayi) System.out.println("Daha büyük bir sayı tahmin ediniz");
        }
        if (sayac>=10) System.out.println("Tahmin hakkınız bitti, malesef bilemediniz");
        else System.out.println("Tebrikler Tututuğum sayıyı "+ sayac+" tahminde bildinzi");
    }

    private static void cozumMetot1() {
        int randomSayi = (int) (Math.random() * 100 + 1);  // 1 den 100 e kadar sayı üretilir
        int tahmin = 0;
        int sayac = 0;
        while (randomSayi != tahmin ) {
            sayac++;
            System.out.print("Lütfen " + sayac + ". tahmininizi giriniz : ");
            tahmin = scanner.nextInt();
            if (tahmin>randomSayi) System.out.println("Daha küçük bir sayı tahmin ediniz");
            else if (tahmin<randomSayi) System.out.println("Daha büyük bir sayı tahmin ediniz");
//            Eşitliği devre dışı bırakmak için alttaki, şekilde yapmadım
//            if (tahmin>randomSayi) System.out.println("Daha küçük bir sayı tahmin ediniz");
//            else System.out.println("Daha büyük bir sayı tahmin ediniz");
        }
        System.out.println("Tututuğum sayıyı "+ sayac+" tahminde bildinzi");
    }


    }//class sonu
