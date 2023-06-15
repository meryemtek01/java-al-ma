package Tasks08;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */


        Scanner input = new Scanner(System.in);
        int toplam = 0;//işleme etki etmeyecek boş bir kutu tanımlandı

        for (int i = 1; i <= 5; i++) {//1 den 5 e kadar bir artımlı tekrar tanımlandı
            System.out.print(i + ". sayı giriniz : ");
            int sayi = input.nextInt();
            if (sayi <= 10 || sayi >= 20) {//girilen 5 sayının 10 ile 20 arası olmama şartı
                toplam += sayi;//10 ile 20 arası olmayan sayılar toplama eklendi
            }//if sonu
        }//for sonu
        System.out.println("girilen sayıların 10 20 arası hariç toplamı : "+toplam);
    }
}
