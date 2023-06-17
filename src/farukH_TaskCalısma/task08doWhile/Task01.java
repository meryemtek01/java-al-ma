package farukH_TaskCalısma.task08doWhile;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */


        int girilenSayi;
        int toplam=0;
        Scanner scan= new Scanner(System.in);

       do {
            if (toplam == 0 ) System.out.print("Lutfen toplanmak icin bir tamsayi giriniz   : ");
            else System.out.print("Lutfen toplanmak icin bir sayı daha giriniz : ");
            girilenSayi=scan.nextInt();

            toplam += girilenSayi;
        }  while(girilenSayi!=0);

        System.out.println("Girilen sayilarin toplami : " + toplam);

        /*
            While loop'un 2 tane negatif yonu vardir
            1- loop'dan once olusturdugumuz ve loop'da kullanacagimiz variable'lara
               yanlis bir deger verirsek, loop bodys'si hic calismayabilir
            2- loop condition'i loop body'sinden bir kez fazla calisir
            bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir
            ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz
         */

    }
}
