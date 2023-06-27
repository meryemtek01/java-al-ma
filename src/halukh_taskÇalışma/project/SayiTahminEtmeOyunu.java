package halukh_taskÇalışma.project;

import java.util.Random;
import java.util.Scanner;

/*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan code create ediniz .
*/
public class SayiTahminEtmeOyunu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rnd=new Random();

        int pcSayi= rnd.nextInt((100)+1);//(0+1,100) arasında
        System.out.println("pcSayi = " + pcSayi);
        System.out.println("*** tahmin oyununa hoş geldiniz *** \n 1 ile 100 arası bir sayı giriniz");
        int tahminSayi= input.nextInt();
        int count= 0;
        if (tahminSayi<100 && tahminSayi>0){

            while (tahminSayi!=pcSayi){//bu şart sagladığı sürece

                if (tahminSayi<pcSayi){
                    System.out.println("sayıtı arttırer"  );
                    tahminSayi= input.nextInt();
                    count++;

                } else if (tahminSayi>pcSayi) {
                    System.out.println("sayıyı azalt"  );
                    tahminSayi=input.nextInt();
                    count++;
                }
            }System.out.println("BİNGOOOoooo kazandın  "+count+"  tahminde buldun");
          //  System.out.println("count = " + count);

        }else System.out.println("1 ile 100 arası sayı giriniz");



    }//main sonu
}//class sonu

