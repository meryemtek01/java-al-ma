package Tasks08_forLoopödev;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcıdan 1'den büyük bir tam sayı gir");
        int sayi = input.nextInt();

        int toplam=0;
        for (int i = 0; i <=sayi ; i++) {//girilen sayıya kadar loop tanımlandı
            toplam+=i*i;

        }
        System.out.println("Sayıların kareleri toplamı: " +toplam);


      /*  for (int i = 1; i <= sayi; i++) {
           toplam += kare+toplam;
           for (int j = 1; j <= i; j++) {
              kare = j * j;
           }

            System.out.println(i+" kare "+ kare);
        }
        System.out.println("toplam "+toplam);*/

    }
}
