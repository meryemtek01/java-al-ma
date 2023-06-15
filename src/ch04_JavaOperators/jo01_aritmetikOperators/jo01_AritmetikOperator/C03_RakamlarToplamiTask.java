package ch04_JavaOperators.jo01_aritmetikOperators.jo01_AritmetikOperator;

import java.util.Scanner;

public class C03_RakamlarToplamiTask {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı sayi giriniz ");
        int sayi = input.nextInt();//user in girdiği deger atandı
        //123%10= kalan 3
        int birlerbasamagi = sayi % 10;//sayının 10 bölümünden kalan birler basamagı atandı
        sayi /= 10; //sayının birler basamagi alındı
        int onlarbasamagi = sayi % 10;//iki basamaga düşen sayının birler basamagı alındı. ilk sayının onlar basamagı
        int yüzlerbasamagi = sayi / 10;//sayıların yuzler basamagı alınmıs oldu
        int toplam = birlerbasamagi + onlarbasamagi + yüzlerbasamagi;
        System.out.println("toplam=" + toplam);//toplam=6
*/
        // kullanıcıdan alınan 3 basamaklı bir sayını rakamları toplamını print eden code create ediniz
        //input 111
        // output 3

        //1.adim Scanner obj create edilir
        //2.adim sout komut ile veri istenir
        //3.adim  int degere atama yapilir input objesinden nextInt() methodu ile
        //4.adim  % ve  10 a bolme uyguylanir

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli sayi gir");

        int sayi = input.nextInt();//user in girdigi deger atandi

        int birlerBasamagi = sayi % 10 ;//sayinin 10 a bolumunden kalan birler basamagi atandi

        sayi /= 10; //sayinin birler basamagi atildi

        int onlarBasamagi = sayi % 10 ; //iki basamaga dusen sayinin birler basamagi alindi. (ilk sayinin onlar basamagi)

        int yuzlerBasamagi = sayi / 10 ; //sayinin yuzler basamagi alinmis oldu


        int toplam = birlerBasamagi + onlarBasamagi +yuzlerBasamagi;

        System.out.println("toplam = " + toplam);//toplam = 6
    }
}
