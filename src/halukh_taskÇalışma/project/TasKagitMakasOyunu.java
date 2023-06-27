package halukh_taskÇalışma.project;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasOyunu {

    static Random rnd = new Random();
    static int pcSayi = rnd.nextInt(3) + 1;// bilgisayarın tahminini 0 almamak için +1 kullandık
    static Scanner input = new Scanner(System.in);
    static int pcCount = 0;
    static int kullanıcıCount = 0;

    public static void main(String[] args) {
        /*
Taş kağıt makas oyunu....
Bilgisayardan rastle(random class kullanılarak) 1-2-3 1=TAŞ, 2=KAĞIT, 3=MAKAS arasında bir sayı alıp kullanıcının
seçimini  kullanarak 3 puan alanın kazan oldugu code create ediniz .
*/
        //rastgeleSayi();
        // kullanıcıGirisi();
        oyna();

    }//main sonu


    private static void oyna() {


        while ((kullanıcıCount != 3 && pcCount != 3)) {
            int pc = rastgeleSayi();
            int kullanıcı = kullanıcıGirisi();
            System.out.println("pcSayi = " + pc);
            switch (kullanıcı) {
                case 1:
                    if (pc == 1) {
                        System.out.println("beraber kaldınız tekrar sayı giriniz");

                    } else if (pc == 2) {
                        System.out.println("bu eli pc kazandı");
                        pcCount++;


                    } else System.out.println("bu eli sen aldın");
                    kullanıcıCount++;


                    break;
                case 2:
                    if (pc == 1) {
                        System.out.println("bu eli sen aldın");
                        kullanıcıCount++;


                    } else if (pc == 2) {
                        System.out.println("beraber kaldınız tekrar sayı giriniz");


                    } else System.out.println("bu eli pc kazandı");
                    pcCount++;


                    break;
                case 3:
                    if (pc == 1) {
                        System.out.println("bu eli pc aldın");
                        pcCount++;


                    } else if (pc == 2) {
                        System.out.println("bu eli sen kazandı");
                        kullanıcıCount++;


                    } else System.out.println("beraber kaldınız tekrar sayı giriniz");
                    break;
                default:
                    System.out.println("yanlış sayı tekrara dene");

                    break;
            }
        }
        System.out.println((kullanıcıCount == 3 ? "tebrikler siz kazandınız:)" : "pc kazandı"));
    }

    private static int kullanıcıGirisi() {
        System.out.println("*** oyunumuza hoş geldiniz *** \n 1=TAŞ, 2=KAĞIT, 3=MAKAS arasında bir sayı alıp kullanın");
        int secim = input.nextInt();
        return secim;
    }


    private static int rastgeleSayi() {
        int pcSayi = rnd.nextInt(3) + 1;// bilgisayarın tahminini 0 almamak için +1 kullandık
        return pcSayi;
    }


}//class sonu
