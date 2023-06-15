package halukh_taskÇalışma.Challange05;

import java.util.Scanner;

public class Q04_ForLoop {
    /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	    ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	    hesaplayan kodu yazın
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tam sayı girebilirmisiniz");
        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = sayi; i >= 1; i--) {
            toplam += i * i;
        }
        System.out.println(sayi+" nın karelerini toplama"+toplam);

    }//main sonu
}//class sonu
